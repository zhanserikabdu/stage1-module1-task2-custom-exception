package com.epam.mjc;


public class StudentManager {

  private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

  public Student find(long studentID) {
    Student res;

    res = Student.getValueOf(studentID);
    if (res==null)
      throw new CustomException("Could not find student with ID " + studentID);

    return res;
  }


}
