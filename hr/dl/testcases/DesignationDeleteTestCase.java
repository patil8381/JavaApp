import com.thinking.machines.hr.dl.dao.*;
import com.thinking.machines.hr.dl.dto.*;
import com.thinking.machines.hr.dl.interfaces.dao.*;
import com.thinking.machines.hr.dl.interfaces.dto.*;
import com.thinking.machines.hr.dl.exceptions.*;

public class DesignationDeleteTestCase 
{
public static void main(String gg[])
{
try
{
int code=Integer.parseInt(gg[0]);
DesignationDTOInterface designationDTO=new DesignationDTO();
DesignationDAOInterface designationDAO=new DesignationDAO();
designationDTO.setCode(code);
designationDAO.delete(code);
}
catch(DAOException d)
{
System.out.println(d.getMessage());
}
}
}