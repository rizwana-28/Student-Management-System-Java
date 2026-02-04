import java.util.*;
class StudentManagementSystem{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Student students[] = new Student[10];
		int count=0;
		int choice=0;
		do{
			System.out.println("select your choice:");
			System.out.println("1.Add student \n 2.Delete student \n 3.Update student \n 4.display all students\n 5.display particular student\n 6.total no of students\n 7.exit");
			choice=sc.nextInt();
			switch(choice){
				default:	
				{
					System.out.println("Invalid choice , re-enter");
					break;
				}
				case 1:
				{
					System.out.println("Enter student details like id,name,mobileno,emailid,m1,m2,m3 marks");
					int id=sc.nextInt();
					String name=sc.next();
					long mob=sc.nextLong();
					String em=sc.next();
					int m1=sc.nextInt();
					int m2=sc.nextInt();
					int m3=sc.nextInt();

					Student s = new Student(id,name,mob,em,m1,m2,m3);
					students[Student.totalnoofstudents]=s;
					Student.totalnoofstudents++;
					break;
				}
				case 2:
				{
					System.out.println("enter id:");
					int id=sc.nextInt();
					for(int i=0;i<Student.totalnoofstudents;i++){
						if(id==students[i].id){
							for(int j=0;j<Student.totalnoofstudents;j++)
							{
								students[j]=students[j+1];
							}

							count++;
						}
					}
					if(count==0){
						System.out.println("ID invalid");

					}
					Student.totalnoofstudents--;
					break;
				}


				
				case 3:
				{
					System.out.println("enter id:");
					int id=sc.nextInt();
					for(int i=0;i<Student.totalnoofstudents;i++){
						if(id==students[i].id){
							System.out.println("Enter student new values like name,mobile,email,m1,m2,m3:");
							String name=sc.next();
							long mob=sc.nextLong();
							String em=sc.next();
							int m1=sc.nextInt();
							int m2=sc.nextInt();
							int m3=sc.nextInt();

							Student s= new Student(id,name,mob,em,m1,m2,m3);
							students[i]=s;
							count++;
						}
					}
					if(count==0){
						System.out.println("ID invalid");
					}
				}

				case 4:
				{
					for(int i=0;i<Student.totalnoofstudents;i++)
					{
						students[i].display();
					}
					break;
				}
				case 5:
				{
					System.out.println("enter id:");
					int id=sc.nextInt();
					for(int i=0;i<Student.totalnoofstudents;i++){
						if(id==students[i].id){
							students[i].display();
							count++;
						}
					}
					if(count==0){
						System.out.println("ID invalid");
					}
				}
				case 6:
				{
					System.out.println(Student.totalnoofstudents);
					break;
				}
				case 7:
				{
					System.out.println("Program is exited");
					break;
				}
				
			}//switch
		}//do
		while(choice!=7);
	}
}