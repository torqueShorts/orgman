package ac.za.cput.adp3.xyzcongolmerate.service;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import ac.za.cput.adp3.xyzcongolmerate.repository.org.OrganisationUserRepository;
import ac.za.cput.adp3.xyzcongolmerate.repository.org.impl.OrganisationUserRepositoryImpl;
import ac.za.cput.adp3.xyzcongolmerate.repository.user.UserRepository;
import ac.za.cput.adp3.xyzcongolmerate.repository.user.impl.UserRepositoryImpl;
import ac.za.cput.adp3.xyzcongolmerate.service.org.OrganisationUserService;
import ac.za.cput.adp3.xyzcongolmerate.service.org.impl.OrganisationUserServiceImpl;
import ac.za.cput.adp3.xyzcongolmerate.service.user.UserService;
import ac.za.cput.adp3.xyzcongolmerate.service.user.impl.UserServiceImpl;

import java.util.HashSet;
import java.util.Set;

public class UsersByOrganisation {

    private static UserService userService = UserServiceImpl.getUserService();
    private static OrganisationUserRepository organisationUser = OrganisationUserRepositoryImpl.getOrganisationUserRepository();

    Set<OrganisationUser> organisationUsers = organisationUser.getAll();
    Set<User> users = userService.getAll();
    Set<OrganisationUser> allUsers;
    Set<String> foundUsers = new HashSet<>();


    public String getSaved(String orgCode)
    {
        for(int i = 0; i < organisationUsers.size(); i++)
        {
            if(organisationUsers.iterator().next().getOrgCode() == orgCode)
            {
                allUsers.add(organisationUsers.iterator().next());
            }
        }

        for(int p=0; p < users.size(); p++)
        {
            if(users.iterator().next().getUserEmail() == allUsers.iterator().next().getUserEmail())
            {
                foundUsers.add(users.iterator().next().getFirstName() + " " + users.iterator().next().getLastName());
            }
        }

        return foundUsers.toString();
    }


}
