import com.thinking.machines.hr.dl.dao.*;
import com.thinking.machines.hr.dl.dto.*;
import com.thinking.machines.hr.dl.interfaces.dao.*;
import com.thinking.machines.hr.dl.interfaces.dto.*;
import com.thinking.machines.hr.dl.exceptions.*;
import java.util.*;
import java.math.*;
import java.text.*;

public class EmployeeGetByAadharCardNumberTestCase
{
public static void main(String gg[])
{
try
{
String aadharCardNumber=gg[0];
EmployeeDTOInterface employeeDTO;
EmployeeDAOInterface employeeDAO=new EmployeeDAO();
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
employeeDTO=employeeDAO.getByAadharCardNumber(aadharCardNumber);

System.out.println("Employee Id : "+employeeDTO.getEmployeeId());
System.out.println("Name : "+employeeDTO.getName());
System.out.println("Designation Code : "+employeeDTO.getDesignationCode());
System.out.println("Date of Birth : "+sdf.format(employeeDTO.getDateOfBirth()));
System.out.println("Gender : "+employeeDTO.getGender());
System.out.println("Is Indian : "+employeeDTO.getIsIndian());
System.out.println("Basic salary : "+employeeDTO.getBasicSalary());
System.out.println("PAN number : "+employeeDTO.getPANNumber());
System.out.println("Aadhar Card number : "+employeeDTO.getAadharCardNumber());
System.out.println("*********************************************\n");

}
catch(DAOException d)
{
System.out.println(d.getMessage());
}
}
}