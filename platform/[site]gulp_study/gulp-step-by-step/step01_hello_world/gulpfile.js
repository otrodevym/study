var gulp = require('gulp');

// 4.0 >= 부터 안됨
// gulp.task('hello', function(){
//     console.log('Hello World!');
// });

gulp.task('hello', async function() {
    console.log('Hello World!');
});

// gulp.task('hello', done => {
//     console.log('Hello World!');
//     done();
// });
