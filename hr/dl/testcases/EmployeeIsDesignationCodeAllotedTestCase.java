import com.thinking.machines.hr.dl.dao.*;
import com.thinking.machines.hr.dl.interfaces.dao.*;
import com.thinking.machines.hr.dl.exceptions.*;

public class EmployeeIsDesignationCodeAllotedTestCase
{
public static void main(String gg[])
{
try
{
int designationCode=Integer.parseInt(gg[0]);
EmployeeDAOInterface employeeDAO=new EmployeeDAO();
boolean result=employeeDAO.isDesignationCodeAllotted(designationCode);
System.out.println("Employee with Designation Code Exists : "+designationCode+" : "+result);
}
catch(DAOException d)
{
System.out.println(d.getMessage());
}
}
}