var gulp = require('gulp');
var uglify = require('gulp-uglify');
var concat = require('gulp-concat');

gulp.task('uglify', async function () {
    return gulp.src('src/*.js')
        .pipe(concat('main.js'))
        .pipe(uglify())
        .pipe(gulp.dest('dist'));
});

gulp.task('watch', async function () {
    gulp.watch('src/*.js', gulp.series('uglify'));
});

gulp.task('default', gulp.series('uglify', 'watch'));
