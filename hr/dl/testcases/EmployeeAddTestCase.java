import java.math.*;
import java.text.*;
import java.util.*;

import com.thinking.machines.enums.*;
import com.thinking.machines.hr.dl.dao.*;
import com.thinking.machines.hr.dl.dto.*;
import com.thinking.machines.hr.dl.interfaces.dao.*;
import com.thinking.machines.hr.dl.interfaces.dto.*;
import com.thinking.machines.hr.dl.exceptions.*;

public class EmployeeAddTestCase 
{
public static void main(String gg[])
{
try
{
String name=gg[0];
int designationCode=Integer.parseInt(gg[1]);
Date dateOfBirth=null;
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
try
{
dateOfBirth=sdf.parse(gg[2]);
}catch(ParseException pe)
{
System.out.println(pe.getMessage());
return;
}
char gender=gg[3].charAt(0);
boolean isIndian=Boolean.parseBoolean(gg[4]);
BigDecimal basicSalary=new BigDecimal(gg[5]);
String PANNumber=gg[6];
String aadharCardNumber=gg[7];

EmployeeDTOInterface employeeDTO=new EmployeeDTO();
EmployeeDAOInterface employeeDAO=new EmployeeDAO();

employeeDTO.setName(name);
employeeDTO.setDesignationCode(designationCode);
employeeDTO.setDateOfBirth(dateOfBirth);
if(gender=='M')
{
employeeDTO.setGender(GENDER.MALE);
}
if(gender=='F')
{
employeeDTO.setGender(GENDER.FEMALE);
}
employeeDTO.setIsIndian(isIndian);
employeeDTO.setBasicSalary(basicSalary);
employeeDTO.setPANNumber(PANNumber);
employeeDTO.setAadharCardNumber(aadharCardNumber);

employeeDAO.add(employeeDTO);
System.out.println("Employee added with employee id : "+employeeDTO.getEmployeeId());
}
catch(DAOException d)
{
System.out.println(d.getMessage());
}
}
}