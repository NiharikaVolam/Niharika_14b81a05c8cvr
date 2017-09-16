import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		students[]=new Student[length];
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		int i=0;
		int id =0;
		String full;
		Date birth;
		Double avgMark;
		try
		{
		if(students==null)
			throw new IllegalArgumentException();
		else
		{
			for(i=0;i<students.length;i++)
			{
				students[i]=new Student();
				students[i].id=students[i].setId(s.nextInt());
				students[i].full=students[i].setFullName(s.next());
				students[i].Date=students[i].setBirthDate(s.next());
				students[i].avgMark=students[i].setavgMark(s.nextDouble());
				
			}
		}
		}
		catch(IllegalArgumentException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		int i=0;
		try
		{
			if(index<0||index>=length)
				throw new IllegalArgumentException();
			else
			{
				return students[index];
			}
		}
		catch(IllegalArgumentException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		int i=0;
		try
		{
			if(index<0||index>students.length)
			{
				throw new  IllegalArgumentException();
			}
			else
			{
				if(index==students.length)
				{
					students[i].setId(student.getId());
					students[i].setFullName(student.getFullName());
					students[i].setBirthDate(student.getBirthDate());
					students[i].setAvgMark(student.getAvgMark());
							
				}
				else
				{
				   Student temp[]=new Student[students.length+1];
				   for(i=0;i<index;i++)
					   temp[i]=students[i];
				   students[index].setId(student.getId());
					students[index].setFullName(student.getFullName());
					students[index].setBirthDate(student.getBirthDate());
					students[index].setAvgMark(student.getAvgMark());
				  for(i=index;i<students.length;i++)
					  temp[i]=students[i];
				  students=temp;
				}
			}
		}
		
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		int i=0,j=1;
		try
		{
		   if(student==null)
			   throw new IllegalArgumentException();
		   else
		   {
			   Student temp[]=new Student[students.length+1];
			   temp[0].setId(student.getId());
				temp[0].setFullName(student.getFullName());
				temp[0].setBirthDate(student.getBirthDate());
				temp[0].setAvgMark(student.getAvgMark());
				for(i=0;i<students.length;i++)
					temp[j++]=students[i];
				students=temp;
		   }
		}
		catch(IllegalArgumentException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		int j=0,i=0;
		try
		{
		if(student==null)
			throw new IllegalArgumentException();
		 else
		 {
			    Student temp[]=new Student[students.length+1];
				for(i=0;i<students.length;i++)
					temp[i]=students[i];
				temp[i].setId(student.getId());
				temp[i].setFullName(student.getFullName());
				temp[i].setBirthDate(student.getBirthDate());
				temp[i].setAvgMark(student.getAvgMark());
				students=temp;
		 }
		}
		catch(IllegalArgumentException e)
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		int j=0,i=0;
		try
		{
		if(student==null||index>=students.length)
			throw new IllegalArgumentException();
		 else
		 {
			    Student temp[]=new Student[students.length+1];
				for(i=0;i<index;i++)
					temp[i]=students[i];
				temp[index].setId(student.getId());
				temp[index].setFullName(student.getFullName());
				temp[index].setBirthDate(student.getBirthDate());
				temp[index].setAvgMark(student.getAvgMark());
				for(i=index;i<students.length;i++)
					temp[i+1]=students[i];
				students=temp;
		 }
		}
		catch(IllegalArgumentException e)
		{
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void remove(int index) {
		
		int j=0,i=0;
		try
		{
		if(student==null||index>=students.length)
			throw new IllegalArgumentException();
		 else
		 {
				for(i=index;i<(students.length-1);i++)
				    students[i]=students[i+1];
				students.length=students.length-1;
		 }
		}
		catch(IllegalArgumentException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		int i=0,j=0;
		int f=0;
		try
		{
			if(student==null)
				throw new IllegalArgumentException();
			else
			{
				for(i=0;i<students.length;i++)
				{
			      if(students[i].compareTo(student)==0)
			      {
			    	  f=1;
			    	for(j=i;j<(students.length-1);j++)
			    		students[j]=students[j+1];
			    	students.length=students.length-1;
			      }
			    }
				
			}
			if(f!=1)
			{
				throw new IllegalArgumentException();
			}
		}
		catch(IllegalArgumentException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void removeFromIndex(int index) {
		
		int i=0,j=0;
		int f=0;
		try
		{
			if(index<0||index>=students.length)
				throw new IllegalArgumentException();
			else
			{
				for(i=index;i<(students.length-1);i++)
				{
			    		students[i]=students[i+1];	
			     }
				students.length=students.length-1;
			 }
				
			
		}
		catch(IllegalArgumentException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		
		int i=0,j=0;
		int f=0;
		try
		{
			if(student==null)
				throw new IllegalArgumentException();
			else
			{
				for(i=0;i<students.length;i++)
				{
			      if(students[i].compareTo(student)==0)
			      {
			    	f=1;
			    	students.length=i+1;
			      }
			    }
			 }
			 if(f==1)
				 throw new IllegalArgumentException();
		}
		catch(IllegalArgumentException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		int y;
	    try
	    {
	    	if(indexOfStudent==0||indexOfStudent>=students.length)
	    		throw new IllegalArgumentException();
	    	else
	    	{
	    		long ageInMillis = new Date().getTime() - students[indexOfStudent].getBirthDate().getTime();

	    	    Date age = new Date(ageInMillis);
	            return age.getYear();
	    	}
	    }
	    catch(IllegalArgumentException e)
	    {
	    	e.printStackTrace();
	    }
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		
		int i=0,y,j=0;
		Student temp[]=new Student[students.length];
		for(i=0;i<students.length;i++)
		{
			
		
		long ageInMillis = new Date().getTime() - students[i].getBirthDate().getTime();

	    Date age = new Date(ageInMillis);
        y=age.getYear();
         if(y==age)
         {
              temp[j++]=students[i];	
          }
		}
		return temp;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		int i=0,j=0;
		int max=-1;
		int m;
		Student temp[]=new Student[students.length];
		for(i=0;i<students.length;i++)
		{
			m=students[i].getAvgMark();
			if(m>max)
				max=m;
		}
		for(i=0;i<students.length;i++)
		{
			if(students[i].getAvgMark()==max)
				temp[j++]=students[i];
		}
		return temp;
		
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		int i=0;
		int f=0;
		try
		{
			if(student==null)
				throw new IllegalArgumentException();
			else
			{
				for(i=0;i<students.length;i++)
				{
			      if(students[i].compareTo(student)==0)
			      {
			    	 if(i!=students.length-1)
			    		 return students[i+1];
			    	 else
			    		 throw new IllegalArgumentException();
			      }
			    }
			 }
		}
		catch(IllegalArgumentException e)
		{
			e.printStackTrace();
		}
	}
}
