var gulp = require('gulp');
gulp.task('hi', async function () {
    console.log('hi')
});
// hello 라고 콘솔에 찍는 task
gulp.task('hello', gulp.series('hi', async function () {
    console.log('Hello');
}));

// world 라고 콘솔에 찍는 task, hello 라는 task가 먼저 완료된 뒤에만 실행된다.
gulp.task('world', gulp.series('hello', async function () {
     console.log('World!');
}));

//gulp를 실행하면 default 로 world task를 실행 (world task는 먼저 hello task를 실행)
gulp.task('default', gulp.series('world'));
