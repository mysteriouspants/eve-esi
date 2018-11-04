/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.troja.eve.esi.api;

import net.troja.eve.esi.ApiException;
import net.troja.eve.esi.model.AllianceContactsLabelsResponse;
import net.troja.eve.esi.model.AllianceContactsResponse;
import net.troja.eve.esi.model.ContactLabelsResponse;
import net.troja.eve.esi.model.ContactsResponse;
import net.troja.eve.esi.model.CorporationContactsLabelsResponse;
import net.troja.eve.esi.model.CorporationContactsResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContactsApi
 */
@Ignore
public class ContactsApiTest {

    private final ContactsApi api = new ContactsApi();

    
    /**
     * Delete contacts
     *
     * Bulk delete contacts  ---   SSO Scope: esi-characters.write_contacts.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCharactersCharacterIdContactsTest() throws ApiException {
        Integer characterId = null;
        List<Integer> contactIds = null;
        String datasource = null;
        String token = null;
        api.deleteCharactersCharacterIdContacts(characterId, contactIds, datasource, token);

        // TODO: test validations
    }
    
    /**
     * Get alliance contacts
     *
     * Return contacts of an alliance  ---  This route is cached for up to 300 seconds  SSO Scope: esi-alliances.read_contacts.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAlliancesAllianceIdContactsTest() throws ApiException {
        Integer allianceId = null;
        String datasource = null;
        String ifNoneMatch = null;
        Integer page = null;
        String token = null;
        List<AllianceContactsResponse> response = api.getAlliancesAllianceIdContacts(allianceId, datasource, ifNoneMatch, page, token);

        // TODO: test validations
    }
    
    /**
     * Get alliance contact labels
     *
     * Return custom labels for an alliance&#39;s contacts  ---  This route is cached for up to 300 seconds  SSO Scope: esi-alliances.read_contacts.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAlliancesAllianceIdContactsLabelsTest() throws ApiException {
        Integer allianceId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String token = null;
        List<AllianceContactsLabelsResponse> response = api.getAlliancesAllianceIdContactsLabels(allianceId, datasource, ifNoneMatch, token);

        // TODO: test validations
    }
    
    /**
     * Get contacts
     *
     * Return contacts of a character  ---  This route is cached for up to 300 seconds  SSO Scope: esi-characters.read_contacts.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdContactsTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        Integer page = null;
        String token = null;
        List<ContactsResponse> response = api.getCharactersCharacterIdContacts(characterId, datasource, ifNoneMatch, page, token);

        // TODO: test validations
    }
    
    /**
     * Get contact labels
     *
     * Return custom labels for a character&#39;s contacts  ---  This route is cached for up to 300 seconds  SSO Scope: esi-characters.read_contacts.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdContactsLabelsTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String token = null;
        List<ContactLabelsResponse> response = api.getCharactersCharacterIdContactsLabels(characterId, datasource, ifNoneMatch, token);

        // TODO: test validations
    }
    
    /**
     * Get corporation contacts
     *
     * Return contacts of a corporation  ---  This route is cached for up to 300 seconds  SSO Scope: esi-corporations.read_contacts.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdContactsTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        String ifNoneMatch = null;
        Integer page = null;
        String token = null;
        List<CorporationContactsResponse> response = api.getCorporationsCorporationIdContacts(corporationId, datasource, ifNoneMatch, page, token);

        // TODO: test validations
    }
    
    /**
     * Get corporation contact labels
     *
     * Return custom labels for a corporation&#39;s contacts  ---  This route is cached for up to 300 seconds  SSO Scope: esi-corporations.read_contacts.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdContactsLabelsTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String token = null;
        List<CorporationContactsLabelsResponse> response = api.getCorporationsCorporationIdContactsLabels(corporationId, datasource, ifNoneMatch, token);

        // TODO: test validations
    }
    
    /**
     * Add contacts
     *
     * Bulk add contacts with same settings  ---   SSO Scope: esi-characters.write_contacts.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCharactersCharacterIdContactsTest() throws ApiException {
        Integer characterId = null;
        List<Integer> contactIds = null;
        Float standing = null;
        String datasource = null;
        List<Long> labelIds = null;
        String token = null;
        Boolean watched = null;
        List<Integer> response = api.postCharactersCharacterIdContacts(characterId, contactIds, standing, datasource, labelIds, token, watched);

        // TODO: test validations
    }
    
    /**
     * Edit contacts
     *
     * Bulk edit contacts with same settings  ---   SSO Scope: esi-characters.write_contacts.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putCharactersCharacterIdContactsTest() throws ApiException {
        Integer characterId = null;
        List<Integer> contactIds = null;
        Float standing = null;
        String datasource = null;
        List<Long> labelIds = null;
        String token = null;
        Boolean watched = null;
        api.putCharactersCharacterIdContacts(characterId, contactIds, standing, datasource, labelIds, token, watched);

        // TODO: test validations
    }
    
}