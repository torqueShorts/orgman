package ac.za.cput.adp3.xyzcongolmerate.service;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import ac.za.cput.adp3.xyzcongolmerate.repository.org.OrganisationRepository;
import ac.za.cput.adp3.xyzcongolmerate.repository.org.OrganisationUserRepository;
import ac.za.cput.adp3.xyzcongolmerate.repository.org.impl.OrganisationRepositoryImpl;
import ac.za.cput.adp3.xyzcongolmerate.repository.org.impl.OrganisationUserRepositoryImpl;
import ac.za.cput.adp3.xyzcongolmerate.service.org.OrganisationService;
import ac.za.cput.adp3.xyzcongolmerate.service.org.impl.OrganisationServiceImpl;
import ac.za.cput.adp3.xyzcongolmerate.service.user.UserService;
import ac.za.cput.adp3.xyzcongolmerate.service.user.impl.UserServiceImpl;

import java.util.HashSet;
import java.util.Set;

public class OrganisationByUser {

    private static OrganisationRepository organisationRepo = OrganisationRepositoryImpl.getOrganisationRepository();
    private static UserService userService = UserServiceImpl.getUserService();
    private static OrganisationUserRepository organisationUser = OrganisationUserRepositoryImpl.getOrganisationUserRepository();

    Set<OrganisationUser> organisationUsers = organisationUser.getAll();
    Set<Organisation> organisations = organisationRepo.getAll();
    Set<OrganisationUser> allUsers;
    Set<String> foundUsers = new HashSet<>();


    public String getSaved(String userEmail)
    {
        for(int i = 0; i < organisationUsers.size(); i++)
        {
            if(organisationUsers.iterator().next().getUserEmail() == userEmail)
            {
                allUsers.add(organisationUsers.iterator().next());
            }
        }

        for(int p=0; p < organisations.size(); p++)
        {
            if(organisations.iterator().next().getOrgCode() == allUsers.iterator().next().getOrgCode())
            {
                foundUsers.add(organisations.iterator().next().getOrgName());
            }
        }

        return foundUsers.toString();
    }

}
