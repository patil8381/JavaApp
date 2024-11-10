import com.thinking.machines.hr.dl.dao.*;
import com.thinking.machines.hr.dl.dto.*;
import com.thinking.machines.hr.dl.interfaces.dao.*;
import com.thinking.machines.hr.dl.interfaces.dto.*;
import com.thinking.machines.hr.dl.exceptions.*;

public class DesignationAddTestCase 
{
public static void main(String gg[])
{
try
{
String title=gg[0];
DesignationDTOInterface designationDTO=new DesignationDTO();
DesignationDAOInterface designationDAO=new DesignationDAO();
designationDTO.setTitle(title);
designationDAO.add(designationDTO);
}
catch(DAOException d)
{
System.out.println(d.getMessage());
}
}
}