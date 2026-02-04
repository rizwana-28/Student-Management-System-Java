class Student{
int id;
String name;
long mobileno;
String emailid;
int m1,m2,m3;
static int totalnoofstudents;
int totalmarkssecured;
double percentage;
char grade;
final static int TOTALMARKS=300;

void display(){
	System.out.println(id+" - "+name+" - "+mobileno+" - "+emailid+" - "+m1+" - "+m2+" - "+m3);
}
int calcTotalMarksSecured()
{
	return m1 + m2 + m3;
}
double calcPercentage(int total)
{
	return (double)total/(double)TOTALMARKS*100;
}
void assignGrade(double per)
{
	if(per>75.0){
		grade='A';
	}
	else if(per>65.0 && per<75.0){
		grade='B';
	}
	else if(per>55.0 && per<65.0){
		grade='C';
	}
	else if(per>45.0 && per<55.0){
		grade='D';
	}
	else if(per>35.0 && per<45.0){
		grade='E';
	}
	else{
		grade='F';
	}





}	
Student(){

}
Student(int id, String name,long mobileno,String emailid,int m1,int m2,int m3){
this.id=id;
this.name=name;
this.mobileno=mobileno;
this.emailid=emailid;
this.m1=m1;
this.m2=m2;
this.m3=m3;
totalmarkssecured=calcTotalMarksSecured();
percentage=calcPercentage(totalmarkssecured);
assignGrade(percentage);
}
}