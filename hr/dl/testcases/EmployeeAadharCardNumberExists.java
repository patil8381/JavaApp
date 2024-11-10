import com.thinking.machines.hr.dl.dao.*;
import com.thinking.machines.hr.dl.dto.*;
import com.thinking.machines.hr.dl.interfaces.dao.*;
import com.thinking.machines.hr.dl.interfaces.dto.*;
import com.thinking.machines.hr.dl.exceptions.*;
import java.util.*;
import java.math.*;
import java.text.*;

public class EmployeeAadharCardNumberExists
{
public static void main(String gg[])
{
try
{
String aadharCardNumber=gg[0];
EmployeeDAOInterface employeeDAO=new EmployeeDAO();

System.out.println("Employee with Aadhar : "+aadharCardNumber+" exists : "+employeeDAO.aadharCardNumberExists(aadharCardNumber));
}
catch(DAOException d)
{
System.out.println(d.getMessage());
}
}
}