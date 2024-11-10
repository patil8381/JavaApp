import com.thinking.machines.hr.dl.dao.*;
import com.thinking.machines.hr.dl.dto.*;
import com.thinking.machines.hr.dl.interfaces.dao.*;
import com.thinking.machines.hr.dl.interfaces.dto.*;
import com.thinking.machines.hr.dl.exceptions.*;
import java.util.*;
import java.math.*;
import java.text.*;

public class EmployeePANNumberExists
{
public static void main(String gg[])
{
try
{
String panNumber=gg[0];
EmployeeDAOInterface employeeDAO=new EmployeeDAO();

System.out.println("Employee with PAN number : "+panNumber+" exists : "+employeeDAO.PANNumberExists(panNumber));
}
catch(DAOException d)
{
System.out.println(d.getMessage());
}
}
}