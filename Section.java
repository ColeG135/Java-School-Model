public class Section  {
   private Teacher teacher;
   private Student newStudent;

   public Teacher getTeacher() {
      return teacher;
   }

   public Student getNewStudent() {
      return newStudent;
   }

   public void setNewStudent(Student newStudent) {
      this.newStudent = newStudent;
   }

   public int getName() {
      return name;
   }

   public void setName(int name) {
      this.name = name;
   }

   public int getCurrentSize() {
      return currentSize;
   }

   public void setCurrentSize(int currentSize) {
      this.currentSize = currentSize;
   }

   public Teacher getGetTeacher() {
      return getTeacher;
   }

   public void setGetTeacher(Teacher getTeacher) {
      this.getTeacher = getTeacher;
   }

   public Student[] getGetStudents() {
      return getStudents;
   }

   public void setGetStudents(Student[] getStudents) {
      this.getStudents = getStudents;
   }

   public void getGetName() {
      int getName;
   }

   public void setGetName(int getName) {
      this.getName = getName;
   }

   private int name;
   private int currentSize;
   public Teacher getTeacher;
   public void setTeacher(Teacher t){}
   public Student[] getStudents;
   public void addStudent(Student s){}
   public int getName;
   public void setname(int name){}
}
