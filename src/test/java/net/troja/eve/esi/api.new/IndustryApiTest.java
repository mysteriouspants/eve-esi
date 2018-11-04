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
import net.troja.eve.esi.model.CharacterIndustryJobsResponse;
import net.troja.eve.esi.model.CharacterMiningResponse;
import net.troja.eve.esi.model.CorporationIndustryJobsResponse;
import net.troja.eve.esi.model.CorporationMiningExtractionsResponse;
import net.troja.eve.esi.model.CorporationMiningObserverResponse;
import net.troja.eve.esi.model.CorporationMiningObserversResponse;
import net.troja.eve.esi.model.IndustryFacilitiesResponse;
import net.troja.eve.esi.model.IndustrySystemsResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IndustryApi
 */
@Ignore
public class IndustryApiTest {

    private final IndustryApi api = new IndustryApi();

    
    /**
     * List character industry jobs
     *
     * List industry jobs placed by a character  ---  This route is cached for up to 300 seconds  SSO Scope: esi-industry.read_character_jobs.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdIndustryJobsTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        Boolean includeCompleted = null;
        String token = null;
        List<CharacterIndustryJobsResponse> response = api.getCharactersCharacterIdIndustryJobs(characterId, datasource, ifNoneMatch, includeCompleted, token);

        // TODO: test validations
    }
    
    /**
     * Character mining ledger
     *
     * Paginated record of all mining done by a character for the past 30 days  ---  This route is cached for up to 600 seconds  SSO Scope: esi-industry.read_character_mining.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdMiningTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        Integer page = null;
        String token = null;
        List<CharacterMiningResponse> response = api.getCharactersCharacterIdMining(characterId, datasource, ifNoneMatch, page, token);

        // TODO: test validations
    }
    
    /**
     * Moon extraction timers
     *
     * Extraction timers for all moon chunks being extracted by refineries belonging to a corporation.  ---  This route is cached for up to 1800 seconds  --- Requires one of the following EVE corporation role(s): Station_Manager  SSO Scope: esi-industry.read_corporation_mining.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationCorporationIdMiningExtractionsTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        String ifNoneMatch = null;
        Integer page = null;
        String token = null;
        List<CorporationMiningExtractionsResponse> response = api.getCorporationCorporationIdMiningExtractions(corporationId, datasource, ifNoneMatch, page, token);

        // TODO: test validations
    }
    
    /**
     * Corporation mining observers
     *
     * Paginated list of all entities capable of observing and recording mining for a corporation  ---  This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Accountant  SSO Scope: esi-industry.read_corporation_mining.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationCorporationIdMiningObserversTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        String ifNoneMatch = null;
        Integer page = null;
        String token = null;
        List<CorporationMiningObserversResponse> response = api.getCorporationCorporationIdMiningObservers(corporationId, datasource, ifNoneMatch, page, token);

        // TODO: test validations
    }
    
    /**
     * Observed corporation mining
     *
     * Paginated record of all mining seen by an observer  ---  This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Accountant  SSO Scope: esi-industry.read_corporation_mining.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationCorporationIdMiningObserversObserverIdTest() throws ApiException {
        Integer corporationId = null;
        Long observerId = null;
        String datasource = null;
        String ifNoneMatch = null;
        Integer page = null;
        String token = null;
        List<CorporationMiningObserverResponse> response = api.getCorporationCorporationIdMiningObserversObserverId(corporationId, observerId, datasource, ifNoneMatch, page, token);

        // TODO: test validations
    }
    
    /**
     * List corporation industry jobs
     *
     * List industry jobs run by a corporation  ---  This route is cached for up to 300 seconds  --- Requires one of the following EVE corporation role(s): Factory_Manager  SSO Scope: esi-industry.read_corporation_jobs.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdIndustryJobsTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        String ifNoneMatch = null;
        Boolean includeCompleted = null;
        Integer page = null;
        String token = null;
        List<CorporationIndustryJobsResponse> response = api.getCorporationsCorporationIdIndustryJobs(corporationId, datasource, ifNoneMatch, includeCompleted, page, token);

        // TODO: test validations
    }
    
    /**
     * List industry facilities
     *
     * Return a list of industry facilities  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIndustryFacilitiesTest() throws ApiException {
        String datasource = null;
        String ifNoneMatch = null;
        List<IndustryFacilitiesResponse> response = api.getIndustryFacilities(datasource, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * List solar system cost indices
     *
     * Return cost indices for solar systems  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIndustrySystemsTest() throws ApiException {
        String datasource = null;
        String ifNoneMatch = null;
        List<IndustrySystemsResponse> response = api.getIndustrySystems(datasource, ifNoneMatch);

        // TODO: test validations
    }
    
}
