import java.util.ArrayList;
class CourseDetails{
	int exam_cost;
	String course_name;
	String university_name;
	public String toString() {
		return "Course[Exam Cost="+exam_cost+",Course Name="+course_name+",University Name="+university_name+"]";
	}
	public CourseDetails(int exam_cost,String course_name,String university_name) {
		this.exam_cost=exam_cost;
		this.course_name=course_name;
		this.university_name=university_name;
	}
}
public class MainClass4{
	public static void main(String[] args) {
		ArrayList<CourseDetails> l1=new ArrayList<CourseDetails>();
		l1.add(new CourseDetails(3000,"BE","VTU"));
		l1.add(new CourseDetails(2000,"Btech","RGUHS"));
		l1.add(new CourseDetails(1000,"MBA","VTU"));
		l1.add(new CourseDetails(3500,"BBA","RGUHS"));
		l1.add(new CourseDetails(4500,"Mtech","VTU"));
		for (int i = 0; i < l1.size(); i++) {
			Object o1=l1.get(i);
			CourseDetails m1=(CourseDetails)o1;
			System.out.println(m1);
		}
	}
}