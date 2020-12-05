var gulp = require('gulp');
var uglify = require('gulp-uglify');
var concat = require('gulp-concat');
var minifycss = require('gulp-minify-css');

//자바스크립트 파일을 minify
gulp.task('uglify', async function () {
    return gulp.src('src/**/*.js') //src 폴더 아래의 모든 js 파일을
        .pipe(concat('main.js')) //병합하고
        .pipe(uglify()) //minify 해서
        .pipe(gulp.dest('dist/js')); //dist 폴더에 저장
});

//CSS 파일을 minify
gulp.task('minifycss', async function () {
    return gulp.src('src/css/*.css') //css 폴더의 main.css 파일을
        .pipe(concat('main.css'))
        .pipe(minifycss()) //포함되어 있는 @import를 분석해서 하나의 파일로 병합하고 minify 해서
        .pipe(gulp.dest('dist/css')); //dist 폴더에 저장
});

//파일 변경 감지
gulp.task('watch', async function () {
    gulp.watch('src/**/*.js', gulp.series('uglify'));
    gulp.watch('src/**/*.css', gulp.series('minifycss'));
});

//gulp를 실행하면 default 로 minifycss task를 실행
gulp.task('default', gulp.series('uglify', 'minifycss', 'watch'));
