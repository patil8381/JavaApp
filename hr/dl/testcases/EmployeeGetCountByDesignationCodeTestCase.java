import com.thinking.machines.hr.dl.dao.*;
import com.thinking.machines.hr.dl.interfaces.dao.*;
import com.thinking.machines.hr.dl.exceptions.*;

public class EmployeeGetCountByDesignationCodeTestCase
{
public static void main(String gg[])
{
try
{
int designationCode=Integer.parseInt(gg[0]);
EmployeeDAOInterface employeeDAO=new EmployeeDAO();
int count=employeeDAO.getCountByDesignationCode(designationCode);
System.out.println("Employee count of Designation Code "+designationCode+" : "+count);
}
catch(DAOException d)
{
System.out.println(d.getMessage());
}
}
}