var gulp = require('gulp');
var uglify = require('gulp-uglify');
var concat = require('gulp-concat');
var minifycss = require('gulp-minify-css');
var minifyhtml = require('gulp-minify-html');
var browserSync = require('browser-sync').create();

//dist 폴더를 기준으로 웹서버 실행


//HTML 파일을 minify
gulp.task('minifyhtml', async function () {
    return gulp.src('src/**/*.html') //src 폴더 아래의 모든 html 파일을
        .pipe(minifyhtml()) //minify 해서
        .pipe(gulp.dest('dist')) //dist 폴더에 저장
        .pipe(browserSync.reload({stream:true})); //browserSync 로 브라우저에 반영
});

//자바스크립트 파일을 minify
gulp.task('uglify', async function () {
    return gulp.src('src/**/*.js') //src 폴더 아래의 모든 js 파일을
        .pipe(concat('main.js')) //병합하고
        .pipe(uglify()) //minify 해서
        .pipe(gulp.dest('dist/js')) //dist 폴더에 저장
        .pipe(browserSync.reload({stream:true})); //browserSync 로 브라우저에 반영
});

//CSS 파일을 minify
gulp.task('minifycss', async function () {
    return gulp.src('src/**/*.css') //src 폴더 아래의 모든 css 파일을
        .pipe(concat('main.css')) //병합하고
        .pipe(minifycss()) //minify 해서
        .pipe(gulp.dest('dist/css')) //dist 폴더에 저장
        .pipe(browserSync.reload({stream:true})); //browserSync 로 브라우저에 반영
});

//파일 변경 감지
gulp.task('watch', async function () {
    gulp.watch('src/**/*.js', gulp.series('uglify'));
    gulp.watch('src/**/*.css', gulp.series('minifycss'));
    gulp.watch('src/**/*.html', gulp.series('minifyhtml'));
});


gulp.task('server', gulp.series('uglify', 'minifycss', 'minifyhtml', async function () {
    return browserSync.init({
        server: {
            baseDir: './dist'
        }
    });
}));

//gulp를 실행하면 default 로 minifycss task를 실행
gulp.task('default', gulp.series('server', 'watch'));
