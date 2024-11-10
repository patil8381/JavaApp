import com.thinking.machines.hr.dl.dao.*;
import com.thinking.machines.hr.dl.dto.*;
import com.thinking.machines.hr.dl.interfaces.dao.*;
import com.thinking.machines.hr.dl.interfaces.dto.*;
import com.thinking.machines.hr.dl.exceptions.*;
import java.util.*;

public class DesignationGetAllTestCase
{
public static void main(String gg[])
{
try
{
Set<DesignationDTOInterface> designations;
DesignationDAOInterface designationDAO=new DesignationDAO();
designations=designationDAO.getAll();

designations.forEach((designationDTO)->{
System.out.printf("Code : %s,Title : %s\n",designationDTO.getCode(),designationDTO.getTitle());
});

}
catch(DAOException d)
{
System.out.println(d.getMessage());
}
}
}