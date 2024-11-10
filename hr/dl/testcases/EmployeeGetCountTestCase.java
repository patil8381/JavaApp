import com.thinking.machines.hr.dl.dao.*;
import com.thinking.machines.hr.dl.interfaces.dao.*;
import com.thinking.machines.hr.dl.exceptions.*;

public class EmployeeGetCountTestCase
{
public static void main(String gg[])
{
try
{
EmployeeDAOInterface employeeDAO=new EmployeeDAO();
int count=employeeDAO.getCount();
System.out.println("Employee count : "+count);
}
catch(DAOException d)
{
System.out.println(d.getMessage());
}
}
}