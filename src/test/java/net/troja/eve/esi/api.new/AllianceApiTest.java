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
import net.troja.eve.esi.model.AllianceIconsResponse;
import net.troja.eve.esi.model.AllianceResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AllianceApi
 */
@Ignore
public class AllianceApiTest {

    private final AllianceApi api = new AllianceApi();

    
    /**
     * List all alliances
     *
     * List all active player alliances  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAlliancesTest() throws ApiException {
        String datasource = null;
        String ifNoneMatch = null;
        List<Integer> response = api.getAlliances(datasource, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Get alliance information
     *
     * Public information about an alliance  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAlliancesAllianceIdTest() throws ApiException {
        Integer allianceId = null;
        String datasource = null;
        String ifNoneMatch = null;
        AllianceResponse response = api.getAlliancesAllianceId(allianceId, datasource, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * List alliance&#39;s corporations
     *
     * List all current member corporations of an alliance  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAlliancesAllianceIdCorporationsTest() throws ApiException {
        Integer allianceId = null;
        String datasource = null;
        String ifNoneMatch = null;
        List<Integer> response = api.getAlliancesAllianceIdCorporations(allianceId, datasource, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Get alliance icon
     *
     * Get the icon urls for a alliance  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAlliancesAllianceIdIconsTest() throws ApiException {
        Integer allianceId = null;
        String datasource = null;
        String ifNoneMatch = null;
        AllianceIconsResponse response = api.getAlliancesAllianceIdIcons(allianceId, datasource, ifNoneMatch);

        // TODO: test validations
    }
    
}