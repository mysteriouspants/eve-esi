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

import java.util.List;
import net.troja.eve.esi.ApiException;
import static net.troja.eve.esi.api.GeneralApiTest.apiClient;
import net.troja.eve.esi.model.CorporationAlliancesHistoryResponse;
import net.troja.eve.esi.model.CorporationBlueprintsResponse;
import net.troja.eve.esi.model.CorporationContainersLogsResponse;
import net.troja.eve.esi.model.CorporationDivisionsResponse;
import net.troja.eve.esi.model.CorporationFacilitiesResponse;
import net.troja.eve.esi.model.CorporationIconsResponse;
import net.troja.eve.esi.model.CorporationMedalsIssuedResponse;
import net.troja.eve.esi.model.CorporationMedalsResponse;
import net.troja.eve.esi.model.CorporationMembersTitlesResponse;
import net.troja.eve.esi.model.CorporationResponse;
import net.troja.eve.esi.model.CorporationRolesHistoryResponse;
import net.troja.eve.esi.model.CorporationShareholdersResponse;
import net.troja.eve.esi.model.CorporationStandingsResponse;
import net.troja.eve.esi.model.CorporationStarbaseResponse;
import net.troja.eve.esi.model.CorporationStarbasesResponse;
import net.troja.eve.esi.model.CorporationTitlesResponse;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for CorporationApi
 */
public class CorporationApiTest extends GeneralApiTest {

    private final CorporationApi api = new CorporationApi();

    @Before
    public void setUp() {
        api.setApiClient(apiClient);
    }

    /**
     * Get corporation information
     *
     * Public information about a corporation --- Alternate route:
     * &#x60;/v2/corporations/{corporation_id}/&#x60; --- This route is cached
     * for up to 3600 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdTest() throws ApiException {
        final CorporationResponse response = api.getCorporationsCorporationId(CORPORATION_ID_TBD, DATASOURCE, null);

        assertThat(response.getTicker(), equalTo("BDNUT"));
        assertThat(response.getAllianceId(), equalTo(ALLIANCE_ID_TRI));
    }

    /**
     * Get corporation blueprints
     *
     * Returns a list of blueprints the corporation owns  ---  This route is cached for up to 3600 seconds  SSO Scope: esi-corporations.read_blueprints.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Needs corporation with read access")
    public void getCorporationsCorporationIdBlueprintsTest() throws ApiException {
        Integer corporationId = null;
        Integer page = null;
        List<CorporationBlueprintsResponse> response = api.getCorporationsCorporationIdBlueprints(corporationId, DATASOURCE, null, page, null);
        // TODO: test validations
    }

    /**
     * Get all corporation ALSC logs
     *
     * Returns logs recorded in the past seven days from all audit log secure containers (ALSC) owned by a given corporation  ---  This route is cached for up to 600 seconds  SSO Scope: esi-corporations.read_container_logs.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Needs corporation with read access")
    public void getCorporationsCorporationIdContainersLogsTest() throws ApiException {
        Integer corporationId = null;
        Integer page = null;
        List<CorporationContainersLogsResponse> response = api.getCorporationsCorporationIdContainersLogs(corporationId, DATASOURCE, null, page, null);

        // TODO: test validations
    }

    /**
     * Get alliance history
     *
     * Get a list of all the alliances a corporation has been a member of ---
     * Alternate route:
     * &#x60;/v1/corporations/{corporation_id}/alliancehistory/&#x60; Alternate
     * route: &#x60;/legacy/corporations/{corporation_id}/alliancehistory/&#x60;
     * Alternate route:
     * &#x60;/dev/corporations/{corporation_id}/alliancehistory/&#x60; --- This
     * route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdAlliancehistoryTest() throws ApiException {
        final List<CorporationAlliancesHistoryResponse> response = api.getCorporationsCorporationIdAlliancehistory(CORPORATION_ID_TBD, DATASOURCE, null);

        assertThat(response.size(), greaterThan(0));
        // The last entry is without alliance!
        final CorporationAlliancesHistoryResponse alliance = response.get(response.size() - 2);
        assertThat(alliance.getAllianceId(), equalTo(ALLIANCE_ID_TRI));
    }

    /**
     * Get corporation divisions
     *
     * Return corporation hangar and wallet division names, only show if a division is not using the default name  ---  This route is cached for up to 3600 seconds  SSO Scope: esi-corporations.read_divisions.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Needs corporation with read access")
    public void getCorporationsCorporationIdDivisionsTest() throws ApiException {
        Integer corporationId = null;
        CorporationDivisionsResponse response = api.getCorporationsCorporationIdDivisions(corporationId, DATASOURCE, null, null);

        assertThat(response, notNullValue());
        assertThat(response.getHangar().size(), greaterThan(0));
        assertThat(response.getWallet().size(), greaterThan(0));
    }

    /**
     * Get corporation facilities
     *
     * Return a corporation&#39;s facilities  ---  This route is cached for up to 3600 seconds  SSO Scope: esi-corporations.read_facilities.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Needs corporation with read access")
    public void getCorporationsCorporationIdFacilitiesTest() throws ApiException {
        Integer corporationId = null;
        List<CorporationFacilitiesResponse> response = api.getCorporationsCorporationIdFacilities(corporationId, DATASOURCE, null, null);

        // TODO: test validations
    }
    

    /**
     * Get corporation icon
     *
     * Get the icon urls for a corporation --- Alternate route:
     * &#x60;/v1/corporations/{corporation_id}/icons/&#x60; Alternate route:
     * &#x60;/legacy/corporations/{corporation_id}/icons/&#x60; Alternate route:
     * &#x60;/dev/corporations/{corporation_id}/icons/&#x60; --- This route is
     * cached for up to 3600 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdIconsTest() throws ApiException {
        final CorporationIconsResponse response = api.getCorporationsCorporationIdIcons(CORPORATION_ID_TBD, DATASOURCE, null);

        assertThat(response.getPx64x64(), notNullValue());
    }

    /**
     * Get corporation medals
     *
     * Returns a corporation&#39;s medals  ---  This route is cached for up to 3600 seconds  SSO Scope: esi-corporations.read_medals.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Needs corporation with read access")
    public void getCorporationsCorporationIdMedalsTest() throws ApiException {
        Integer corporationId = null;
        Integer page = null;
        List<CorporationMedalsResponse> response = api.getCorporationsCorporationIdMedals(corporationId, DATASOURCE, null, page, null);

        // TODO: test validations
    }

    /**
     * Get corporation issued medals
     *
     * Returns medals issued by a corporation  ---  This route is cached for up to 3600 seconds  SSO Scope: esi-corporations.read_medals.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Needs corporation with read access")
    public void getCorporationsCorporationIdMedalsIssuedTest() throws ApiException {
        Integer corporationId = null;
        Integer page = null;
        List<CorporationMedalsIssuedResponse> response = api.getCorporationsCorporationIdMedalsIssued(corporationId, DATASOURCE, null, page, null);

        // TODO: test validations
    }

    /**
     * Get corporation members
     *
     * Read the current list of members if the calling character is a member.
     * --- Alternate route:
     * &#x60;/v2/corporations/{corporation_id}/members/&#x60; Alternate route:
     * &#x60;/legacy/corporations/{corporation_id}/members/&#x60; Alternate
     * route: &#x60;/dev/corporations/{corporation_id}/members/&#x60; --- This
     * route is cached for up to 3600 seconds SSO Scope:
     * esi-corporations.read_corporation_membership.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    @Ignore("One can only get the members of the own corp")
    public void getCorporationsCorporationIdMembersTest() throws ApiException {
        // final List<CorporationMembersResponse> response =
        // api.getCorporationsCorporationIdMembers(CORPORATION_ID_AAC,
        // DATASOURCE);
    }

    /**
     * Get corporation member limit
     *
     * Return a corporation&#39;s member limit, not including CEO himself  ---  This route is cached for up to 3600 seconds  SSO Scope: esi-corporations.track_members.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Needs corporation with read access")
    public void getCorporationsCorporationIdMembersLimitTest() throws ApiException {
        Integer corporationId = null;
        Integer response = api.getCorporationsCorporationIdMembersLimit(corporationId, DATASOURCE, null, null);

        assertThat(response, notNullValue());
        assertThat(response, greaterThan(0));
    }

    /**
     * Get corporation&#39;s members&#39; titles
     *
     * Returns a corporation&#39;s members&#39; titles  ---  This route is cached for up to 3600 seconds  SSO Scope: esi-corporations.read_titles.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Needs corporation with read access")
    public void getCorporationsCorporationIdMembersTitlesTest() throws ApiException {
        Integer corporationId = null;
        List<CorporationMembersTitlesResponse> response = api.getCorporationsCorporationIdMembersTitles(corporationId, DATASOURCE, null, null);

        // TODO: test validations
    }

    /**
     * Get corporation members
     *
     * Read the current list of members if the calling character is a member.
     * --- This route is cached for up to 3600 seconds SSO Scope:
     * esi-corporations.read_corporation_membership.v1 SSO Scope:
     * esi-corporations.track_members.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    @Ignore("One can only get the members of the own corp")
    public void getCorporationsCorporationIdMembertrackingTest() throws ApiException {
        // List<CorporationMemberTrackingResponse> response =
        // api.getCorporationsCorporationIdMembertracking(corporationId,
        // DATASOURCE, null, null, null);
    }

    /**
     * Get corporation member roles
     *
     * Return the roles of all members if the character has the personnel
     * manager role or any grantable role. --- Alternate route:
     * &#x60;/v1/corporations/{corporation_id}/roles/&#x60; Alternate route:
     * &#x60;/legacy/corporations/{corporation_id}/roles/&#x60; Alternate route:
     * &#x60;/dev/corporations/{corporation_id}/roles/&#x60; --- This route is
     * cached for up to 3600 seconds SSO Scope:
     * esi-corporations.read_corporation_membership.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    @Ignore("Testing these would need special rights in the corp")
    public void getCorporationsCorporationIdRolesTest() throws ApiException {
        // List<CorporationRolesResponse> response =
        // api.getCorporationsCorporationIdRoles(corporationId, DATASOURCE);
    }

    /**
     * Get corporation member roles history
     *
     * Return how roles have changed for a coporation&#39;s members, up to a month  ---  This route is cached for up to 3600 seconds  SSO Scope: esi-corporations.read_corporation_membership.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Needs corporation with read access")
    public void getCorporationsCorporationIdRolesHistoryTest() throws ApiException {
        Integer corporationId = null;
        Integer page = null;
        List<CorporationRolesHistoryResponse> response = api.getCorporationsCorporationIdRolesHistory(corporationId, DATASOURCE, null, page, null);

        // TODO: test validations
    }

    /**
     * Get corporation members
     *
     * Return the current member list of a corporation, the token&#39;s character need to be a member of the corporation.  ---  This route is cached for up to 3600 seconds  SSO Scope: esi-wallet.read_corporation_wallets.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Needs corporation with read access")
    public void getCorporationsCorporationIdShareholdersTest() throws ApiException {
        Integer corporationId = null;
        Integer page = null;
        List<CorporationShareholdersResponse> response = api.getCorporationsCorporationIdShareholders(corporationId, DATASOURCE, null, page, null);
        // TODO: test validations
    }

    /**
     * Get corporation standings
     *
     * Return corporation standings from agents, NPC corporations, and factions  ---  This route is cached for up to 3600 seconds  SSO Scope: esi-corporations.read_standings.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Needs corporation with read access")
    public void getCorporationsCorporationIdStandingsTest() throws ApiException {
        Integer corporationId = null;
        Integer page = null;
        List<CorporationStandingsResponse> response = api.getCorporationsCorporationIdStandings(corporationId, DATASOURCE, null, page, null);

        // TODO: test validations
    }

    /**
     * Get corporation starbases (POSes)
     *
     * Returns list of corporation starbases (POSes)  ---  This route is cached for up to 3600 seconds  SSO Scope: esi-corporations.read_starbases.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Needs corporation with read access")
    public void getCorporationsCorporationIdStarbasesTest() throws ApiException {
        Integer corporationId = null;
        Integer page = null;
        List<CorporationStarbasesResponse> response = api.getCorporationsCorporationIdStarbases(corporationId, DATASOURCE, null, page, null);

        // TODO: test validations
    }

    /**
     * Get starbase (POS) detail
     *
     * Returns various settings and fuels of a starbase (POS)  ---  This route is cached for up to 3600 seconds  SSO Scope: esi-corporations.read_starbases.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Needs corporation with read access")
    public void getCorporationsCorporationIdStarbasesStarbaseIdTest() throws ApiException {
        Integer corporationId = null;
        Long starbaseId = null;
        Integer systemId = null;
        CorporationStarbaseResponse response = api.getCorporationsCorporationIdStarbasesStarbaseId(corporationId, starbaseId, systemId, DATASOURCE, null, null);

        // TODO: test validations
    }

    /**
     * Get corporation structures
     *
     * Get a list of corporation structures --- Alternate route:
     * &#x60;/v1/corporations/{corporation_id}/structures/&#x60; Alternate
     * route: &#x60;/legacy/corporations/{corporation_id}/structures/&#x60;
     * Alternate route:
     * &#x60;/dev/corporations/{corporation_id}/structures/&#x60; --- This route
     * is cached for up to 3600 seconds SSO Scope:
     * esi-corporations.read_structures.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    @Ignore("Can't test that")
    public void getCorporationsCorporationIdStructuresTest() throws ApiException {
        // final Integer corporationId = null;
        // final Integer page = null;
        // final String token = null;
        // final String userAgent = null;
        // final String xUserAgent = null;
        // final List<CorporationStructuresResponse> response =
        // api.getCorporationsCorporationIdStructures(corporationId,
        // DATASOURCE, LANGUAGE, page, token, userAgent, xUserAgent);
    }

    /**
     * Get corporation titles
     *
     * Returns a corporation&#39;s titles  ---  This route is cached for up to 3600 seconds  SSO Scope: esi-corporations.read_titles.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Needs corporation with read access")
    public void getCorporationsCorporationIdTitlesTest() throws ApiException {
        Integer corporationId = null;
        List<CorporationTitlesResponse> response = api.getCorporationsCorporationIdTitles(corporationId, DATASOURCE, null, null);
    }

    /**
     * Get npc corporations
     *
     * Get a list of npc corporations --- Alternate route:
     * &#x60;/v1/corporations/npccorps/&#x60; Alternate route:
     * &#x60;/legacy/corporations/npccorps/&#x60; Alternate route:
     * &#x60;/dev/corporations/npccorps/&#x60; --- This route is cached for up
     * to 3600 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    @Ignore("Doesn't work?!?!")
    public void getCorporationsNpccorpsTest() throws ApiException {
        final List<Integer> response = api.getCorporationsNpccorps(DATASOURCE, null);

        assertThat(response.size(), equalTo(50));
    }
}
