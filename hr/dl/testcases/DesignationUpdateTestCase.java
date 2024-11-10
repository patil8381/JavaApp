import com.thinking.machines.hr.dl.dao.*;
import com.thinking.machines.hr.dl.dto.*;
import com.thinking.machines.hr.dl.interfaces.dao.*;
import com.thinking.machines.hr.dl.interfaces.dto.*;
import com.thinking.machines.hr.dl.exceptions.*;

public class DesignationUpdateTestCase 
{
public static void main(String gg[])
{
try
{
int code=Integer.parseInt(gg[0]);
String title=gg[1];
DesignationDTOInterface designationDTO=new DesignationDTO();
DesignationDAOInterface designationDAO=new DesignationDAO();
designationDTO.setCode(code);
designationDTO.setTitle(title);
designationDAO.update(designationDTO);
}
catch(DAOException d)
{
System.out.println(d.getMessage());
}
}
}