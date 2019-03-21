function createCourse(courseTitle,courseDuration,courseStudents)
{
    var values=new Object;
    values.courseTitle=courseTitle;
    values.courseDuration=courseDuration;
    values.courseStudents=courseStudents;
    return values;
}
console.log(createCourse('abc','4','gds','hgsd','hgd'));