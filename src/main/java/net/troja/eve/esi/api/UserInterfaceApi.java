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

import net.troja.eve.esi.ApiCallback;
import net.troja.eve.esi.ApiClient;
import net.troja.eve.esi.ApiException;
import net.troja.eve.esi.ApiResponse;
import net.troja.eve.esi.Configuration;
import net.troja.eve.esi.Pair;
import net.troja.eve.esi.ProgressRequestBody;
import net.troja.eve.esi.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import net.troja.eve.esi.model.UiNewMail;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserInterfaceApi {
    private ApiClient apiClient;

    public UserInterfaceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UserInterfaceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for postUiAutopilotWaypoint */
    private com.squareup.okhttp.Call postUiAutopilotWaypointCall(Boolean addToBeginning, Boolean clearOtherWaypoints,
            Long destinationId, String datasource, String token,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/ui/autopilot/waypoint/".replaceAll("\\{format\\}", "json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (addToBeginning != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "add_to_beginning", addToBeginning));
        if (clearOtherWaypoints != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "clear_other_waypoints", clearOtherWaypoints));
        if (datasource != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));
        if (destinationId != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "destination_id", destinationId));
        if (token != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "token", token));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null)
            localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain)
                        throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "evesso" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams,
                localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postUiAutopilotWaypointValidateBeforeCall(Boolean addToBeginning,
            Boolean clearOtherWaypoints, Long destinationId, String datasource, String token,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'addToBeginning' is set
        if (addToBeginning == null) {
            throw new ApiException(
                    "Missing the required parameter 'addToBeginning' when calling postUiAutopilotWaypoint(Async)");
        }

        // verify the required parameter 'clearOtherWaypoints' is set
        if (clearOtherWaypoints == null) {
            throw new ApiException(
                    "Missing the required parameter 'clearOtherWaypoints' when calling postUiAutopilotWaypoint(Async)");
        }

        // verify the required parameter 'destinationId' is set
        if (destinationId == null) {
            throw new ApiException(
                    "Missing the required parameter 'destinationId' when calling postUiAutopilotWaypoint(Async)");
        }

        com.squareup.okhttp.Call call = postUiAutopilotWaypointCall(addToBeginning, clearOtherWaypoints, destinationId,
                datasource, token, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Set Autopilot Waypoint Set a solar system as autopilot waypoint --- SSO
     * Scope: esi-ui.write_waypoint.v1
     * 
     * @param addToBeginning
     *            Whether this solar system should be added to the beginning of
     *            all waypoints (required)
     * @param clearOtherWaypoints
     *            Whether clean other waypoints beforing adding this one
     *            (required)
     * @param destinationId
     *            The destination to travel to, can be solar system, station or
     *            structure&#39;s id (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public void postUiAutopilotWaypoint(Boolean addToBeginning, Boolean clearOtherWaypoints, Long destinationId,
            String datasource, String token) throws ApiException {
        postUiAutopilotWaypointWithHttpInfo(addToBeginning, clearOtherWaypoints, destinationId, datasource, token);
    }

    /**
     * Set Autopilot Waypoint Set a solar system as autopilot waypoint --- SSO
     * Scope: esi-ui.write_waypoint.v1
     * 
     * @param addToBeginning
     *            Whether this solar system should be added to the beginning of
     *            all waypoints (required)
     * @param clearOtherWaypoints
     *            Whether clean other waypoints beforing adding this one
     *            (required)
     * @param destinationId
     *            The destination to travel to, can be solar system, station or
     *            structure&#39;s id (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<Void> postUiAutopilotWaypointWithHttpInfo(Boolean addToBeginning, Boolean clearOtherWaypoints,
            Long destinationId, String datasource, String token) throws ApiException {
        com.squareup.okhttp.Call call = postUiAutopilotWaypointValidateBeforeCall(addToBeginning, clearOtherWaypoints,
                destinationId, datasource, token, null, null);
        return apiClient.execute(call);
    }

    /**
     * Set Autopilot Waypoint (asynchronously) Set a solar system as autopilot
     * waypoint --- SSO Scope: esi-ui.write_waypoint.v1
     * 
     * @param addToBeginning
     *            Whether this solar system should be added to the beginning of
     *            all waypoints (required)
     * @param clearOtherWaypoints
     *            Whether clean other waypoints beforing adding this one
     *            (required)
     * @param destinationId
     *            The destination to travel to, can be solar system, station or
     *            structure&#39;s id (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public com.squareup.okhttp.Call postUiAutopilotWaypointAsync(Boolean addToBeginning, Boolean clearOtherWaypoints,
            Long destinationId, String datasource, String token, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postUiAutopilotWaypointValidateBeforeCall(addToBeginning, clearOtherWaypoints,
                destinationId, datasource, token, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }

    /* Build call for postUiOpenwindowContract */
    private com.squareup.okhttp.Call postUiOpenwindowContractCall(Integer contractId, String datasource, String token,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/ui/openwindow/contract/".replaceAll("\\{format\\}", "json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (contractId != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "contract_id", contractId));
        if (datasource != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));
        if (token != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "token", token));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null)
            localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain)
                        throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "evesso" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams,
                localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postUiOpenwindowContractValidateBeforeCall(Integer contractId, String datasource,
            String token, final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'contractId' is set
        if (contractId == null) {
            throw new ApiException(
                    "Missing the required parameter 'contractId' when calling postUiOpenwindowContract(Async)");
        }

        com.squareup.okhttp.Call call = postUiOpenwindowContractCall(contractId, datasource, token, progressListener,
                progressRequestListener);
        return call;

    }

    /**
     * Open Contract Window Open the contract window inside the client --- SSO
     * Scope: esi-ui.open_window.v1
     * 
     * @param contractId
     *            The contract to open (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public void postUiOpenwindowContract(Integer contractId, String datasource, String token) throws ApiException {
        postUiOpenwindowContractWithHttpInfo(contractId, datasource, token);
    }

    /**
     * Open Contract Window Open the contract window inside the client --- SSO
     * Scope: esi-ui.open_window.v1
     * 
     * @param contractId
     *            The contract to open (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<Void> postUiOpenwindowContractWithHttpInfo(Integer contractId, String datasource, String token)
            throws ApiException {
        com.squareup.okhttp.Call call = postUiOpenwindowContractValidateBeforeCall(contractId, datasource, token, null,
                null);
        return apiClient.execute(call);
    }

    /**
     * Open Contract Window (asynchronously) Open the contract window inside the
     * client --- SSO Scope: esi-ui.open_window.v1
     * 
     * @param contractId
     *            The contract to open (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public com.squareup.okhttp.Call postUiOpenwindowContractAsync(Integer contractId, String datasource, String token,
            final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postUiOpenwindowContractValidateBeforeCall(contractId, datasource, token,
                progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }

    /* Build call for postUiOpenwindowInformation */
    private com.squareup.okhttp.Call postUiOpenwindowInformationCall(Integer targetId, String datasource, String token,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/ui/openwindow/information/".replaceAll("\\{format\\}", "json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (datasource != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));
        if (targetId != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "target_id", targetId));
        if (token != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "token", token));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null)
            localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain)
                        throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "evesso" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams,
                localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postUiOpenwindowInformationValidateBeforeCall(Integer targetId, String datasource,
            String token, final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'targetId' is set
        if (targetId == null) {
            throw new ApiException(
                    "Missing the required parameter 'targetId' when calling postUiOpenwindowInformation(Async)");
        }

        com.squareup.okhttp.Call call = postUiOpenwindowInformationCall(targetId, datasource, token, progressListener,
                progressRequestListener);
        return call;

    }

    /**
     * Open Information Window Open the information window for a character,
     * corporation or alliance inside the client --- SSO Scope:
     * esi-ui.open_window.v1
     * 
     * @param targetId
     *            The target to open (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public void postUiOpenwindowInformation(Integer targetId, String datasource, String token) throws ApiException {
        postUiOpenwindowInformationWithHttpInfo(targetId, datasource, token);
    }

    /**
     * Open Information Window Open the information window for a character,
     * corporation or alliance inside the client --- SSO Scope:
     * esi-ui.open_window.v1
     * 
     * @param targetId
     *            The target to open (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<Void> postUiOpenwindowInformationWithHttpInfo(Integer targetId, String datasource, String token)
            throws ApiException {
        com.squareup.okhttp.Call call = postUiOpenwindowInformationValidateBeforeCall(targetId, datasource, token,
                null, null);
        return apiClient.execute(call);
    }

    /**
     * Open Information Window (asynchronously) Open the information window for
     * a character, corporation or alliance inside the client --- SSO Scope:
     * esi-ui.open_window.v1
     * 
     * @param targetId
     *            The target to open (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public com.squareup.okhttp.Call postUiOpenwindowInformationAsync(Integer targetId, String datasource, String token,
            final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postUiOpenwindowInformationValidateBeforeCall(targetId, datasource, token,
                progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }

    /* Build call for postUiOpenwindowMarketdetails */
    private com.squareup.okhttp.Call postUiOpenwindowMarketdetailsCall(Integer typeId, String datasource, String token,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/ui/openwindow/marketdetails/".replaceAll("\\{format\\}", "json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (datasource != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));
        if (token != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "token", token));
        if (typeId != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "type_id", typeId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null)
            localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain)
                        throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "evesso" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams,
                localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postUiOpenwindowMarketdetailsValidateBeforeCall(Integer typeId, String datasource,
            String token, final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'typeId' is set
        if (typeId == null) {
            throw new ApiException(
                    "Missing the required parameter 'typeId' when calling postUiOpenwindowMarketdetails(Async)");
        }

        com.squareup.okhttp.Call call = postUiOpenwindowMarketdetailsCall(typeId, datasource, token, progressListener,
                progressRequestListener);
        return call;

    }

    /**
     * Open Market Details Open the market details window for a specific typeID
     * inside the client --- SSO Scope: esi-ui.open_window.v1
     * 
     * @param typeId
     *            The item type to open in market window (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public void postUiOpenwindowMarketdetails(Integer typeId, String datasource, String token) throws ApiException {
        postUiOpenwindowMarketdetailsWithHttpInfo(typeId, datasource, token);
    }

    /**
     * Open Market Details Open the market details window for a specific typeID
     * inside the client --- SSO Scope: esi-ui.open_window.v1
     * 
     * @param typeId
     *            The item type to open in market window (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<Void> postUiOpenwindowMarketdetailsWithHttpInfo(Integer typeId, String datasource, String token)
            throws ApiException {
        com.squareup.okhttp.Call call = postUiOpenwindowMarketdetailsValidateBeforeCall(typeId, datasource, token,
                null, null);
        return apiClient.execute(call);
    }

    /**
     * Open Market Details (asynchronously) Open the market details window for a
     * specific typeID inside the client --- SSO Scope: esi-ui.open_window.v1
     * 
     * @param typeId
     *            The item type to open in market window (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public com.squareup.okhttp.Call postUiOpenwindowMarketdetailsAsync(Integer typeId, String datasource, String token,
            final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postUiOpenwindowMarketdetailsValidateBeforeCall(typeId, datasource, token,
                progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }

    /* Build call for postUiOpenwindowNewmail */
    private com.squareup.okhttp.Call postUiOpenwindowNewmailCall(UiNewMail newMail, String datasource, String token,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = newMail;

        // create path and map variables
        String localVarPath = "/v1/ui/openwindow/newmail/".replaceAll("\\{format\\}", "json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (datasource != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));
        if (token != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "token", token));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null)
            localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain)
                        throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "evesso" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams,
                localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postUiOpenwindowNewmailValidateBeforeCall(UiNewMail newMail, String datasource,
            String token, final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'newMail' is set
        if (newMail == null) {
            throw new ApiException(
                    "Missing the required parameter 'newMail' when calling postUiOpenwindowNewmail(Async)");
        }

        com.squareup.okhttp.Call call = postUiOpenwindowNewmailCall(newMail, datasource, token, progressListener,
                progressRequestListener);
        return call;

    }

    /**
     * Open New Mail Window Open the New Mail window, according to settings from
     * the request if applicable --- SSO Scope: esi-ui.open_window.v1
     * 
     * @param newMail
     *            The details of mail to create (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public void postUiOpenwindowNewmail(UiNewMail newMail, String datasource, String token) throws ApiException {
        postUiOpenwindowNewmailWithHttpInfo(newMail, datasource, token);
    }

    /**
     * Open New Mail Window Open the New Mail window, according to settings from
     * the request if applicable --- SSO Scope: esi-ui.open_window.v1
     * 
     * @param newMail
     *            The details of mail to create (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<Void> postUiOpenwindowNewmailWithHttpInfo(UiNewMail newMail, String datasource, String token)
            throws ApiException {
        com.squareup.okhttp.Call call = postUiOpenwindowNewmailValidateBeforeCall(newMail, datasource, token, null,
                null);
        return apiClient.execute(call);
    }

    /**
     * Open New Mail Window (asynchronously) Open the New Mail window, according
     * to settings from the request if applicable --- SSO Scope:
     * esi-ui.open_window.v1
     * 
     * @param newMail
     *            The details of mail to create (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public com.squareup.okhttp.Call postUiOpenwindowNewmailAsync(UiNewMail newMail, String datasource, String token,
            final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postUiOpenwindowNewmailValidateBeforeCall(newMail, datasource, token,
                progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
