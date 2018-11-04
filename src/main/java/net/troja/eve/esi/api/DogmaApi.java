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

import net.troja.eve.esi.model.DogmaAttributeResponse;
import net.troja.eve.esi.model.DogmaDynamicItemsResponse;
import net.troja.eve.esi.model.DogmaEffectResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DogmaApi {
    private ApiClient apiClient;

    public DogmaApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DogmaApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getDogmaAttributes */
    private com.squareup.okhttp.Call getDogmaAttributesCall(String datasource, String ifNoneMatch,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/dogma/attributes/".replaceAll("\\{format\\}", "json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (datasource != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifNoneMatch != null)
            localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));

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

        String[] localVarAuthNames = new String[] {};
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams,
                localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDogmaAttributesValidateBeforeCall(String datasource, String ifNoneMatch,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        com.squareup.okhttp.Call call = getDogmaAttributesCall(datasource, ifNoneMatch, progressListener,
                progressRequestListener);
        return call;

    }

    /**
     * Get attributes Get a list of dogma attribute ids --- This route expires
     * daily at 11:05
     * 
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @return List&lt;Integer&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public List<Integer> getDogmaAttributes(String datasource, String ifNoneMatch) throws ApiException {
        ApiResponse<List<Integer>> resp = getDogmaAttributesWithHttpInfo(datasource, ifNoneMatch);
        return resp.getData();
    }

    /**
     * Get attributes Get a list of dogma attribute ids --- This route expires
     * daily at 11:05
     * 
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @return ApiResponse&lt;List&lt;Integer&gt;&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<List<Integer>> getDogmaAttributesWithHttpInfo(String datasource, String ifNoneMatch)
            throws ApiException {
        com.squareup.okhttp.Call call = getDogmaAttributesValidateBeforeCall(datasource, ifNoneMatch, null, null);
        Type localVarReturnType = new TypeToken<List<Integer>>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get attributes (asynchronously) Get a list of dogma attribute ids ---
     * This route expires daily at 11:05
     * 
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public com.squareup.okhttp.Call getDogmaAttributesAsync(String datasource, String ifNoneMatch,
            final ApiCallback<List<Integer>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDogmaAttributesValidateBeforeCall(datasource, ifNoneMatch, progressListener,
                progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Integer>>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /* Build call for getDogmaAttributesAttributeId */
    private com.squareup.okhttp.Call getDogmaAttributesAttributeIdCall(Integer attributeId, String datasource,
            String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/dogma/attributes/{attribute_id}/".replaceAll("\\{format\\}", "json").replaceAll(
                "\\{" + "attribute_id" + "\\}", apiClient.escapeString(attributeId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (datasource != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifNoneMatch != null)
            localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));

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

        String[] localVarAuthNames = new String[] {};
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams,
                localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDogmaAttributesAttributeIdValidateBeforeCall(Integer attributeId,
            String datasource, String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'attributeId' is set
        if (attributeId == null) {
            throw new ApiException(
                    "Missing the required parameter 'attributeId' when calling getDogmaAttributesAttributeId(Async)");
        }

        com.squareup.okhttp.Call call = getDogmaAttributesAttributeIdCall(attributeId, datasource, ifNoneMatch,
                progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get attribute information Get information on a dogma attribute --- This
     * route expires daily at 11:05
     * 
     * @param attributeId
     *            A dogma attribute ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @return DogmaAttributeResponse
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public DogmaAttributeResponse getDogmaAttributesAttributeId(Integer attributeId, String datasource,
            String ifNoneMatch) throws ApiException {
        ApiResponse<DogmaAttributeResponse> resp = getDogmaAttributesAttributeIdWithHttpInfo(attributeId, datasource,
                ifNoneMatch);
        return resp.getData();
    }

    /**
     * Get attribute information Get information on a dogma attribute --- This
     * route expires daily at 11:05
     * 
     * @param attributeId
     *            A dogma attribute ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @return ApiResponse&lt;DogmaAttributeResponse&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<DogmaAttributeResponse> getDogmaAttributesAttributeIdWithHttpInfo(Integer attributeId,
            String datasource, String ifNoneMatch) throws ApiException {
        com.squareup.okhttp.Call call = getDogmaAttributesAttributeIdValidateBeforeCall(attributeId, datasource,
                ifNoneMatch, null, null);
        Type localVarReturnType = new TypeToken<DogmaAttributeResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get attribute information (asynchronously) Get information on a dogma
     * attribute --- This route expires daily at 11:05
     * 
     * @param attributeId
     *            A dogma attribute ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public com.squareup.okhttp.Call getDogmaAttributesAttributeIdAsync(Integer attributeId, String datasource,
            String ifNoneMatch, final ApiCallback<DogmaAttributeResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDogmaAttributesAttributeIdValidateBeforeCall(attributeId, datasource,
                ifNoneMatch, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DogmaAttributeResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /* Build call for getDogmaDynamicItemsTypeIdItemId */
    private com.squareup.okhttp.Call getDogmaDynamicItemsTypeIdItemIdCall(Long itemId, Integer typeId,
            String datasource, String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/dogma/dynamic/items/{type_id}/{item_id}/".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "item_id" + "\\}", apiClient.escapeString(itemId.toString()))
                .replaceAll("\\{" + "type_id" + "\\}", apiClient.escapeString(typeId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (datasource != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifNoneMatch != null)
            localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));

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

        String[] localVarAuthNames = new String[] {};
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams,
                localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDogmaDynamicItemsTypeIdItemIdValidateBeforeCall(Long itemId, Integer typeId,
            String datasource, String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new ApiException(
                    "Missing the required parameter 'itemId' when calling getDogmaDynamicItemsTypeIdItemId(Async)");
        }

        // verify the required parameter 'typeId' is set
        if (typeId == null) {
            throw new ApiException(
                    "Missing the required parameter 'typeId' when calling getDogmaDynamicItemsTypeIdItemId(Async)");
        }

        com.squareup.okhttp.Call call = getDogmaDynamicItemsTypeIdItemIdCall(itemId, typeId, datasource, ifNoneMatch,
                progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get dynamic item information Returns info about a dynamic item resulting
     * from mutation with a mutaplasmid. --- This route expires daily at 11:05
     * 
     * @param itemId
     *            item_id integer (required)
     * @param typeId
     *            type_id integer (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @return DogmaDynamicItemsResponse
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public DogmaDynamicItemsResponse getDogmaDynamicItemsTypeIdItemId(Long itemId, Integer typeId, String datasource,
            String ifNoneMatch) throws ApiException {
        ApiResponse<DogmaDynamicItemsResponse> resp = getDogmaDynamicItemsTypeIdItemIdWithHttpInfo(itemId, typeId,
                datasource, ifNoneMatch);
        return resp.getData();
    }

    /**
     * Get dynamic item information Returns info about a dynamic item resulting
     * from mutation with a mutaplasmid. --- This route expires daily at 11:05
     * 
     * @param itemId
     *            item_id integer (required)
     * @param typeId
     *            type_id integer (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @return ApiResponse&lt;DogmaDynamicItemsResponse&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<DogmaDynamicItemsResponse> getDogmaDynamicItemsTypeIdItemIdWithHttpInfo(Long itemId,
            Integer typeId, String datasource, String ifNoneMatch) throws ApiException {
        com.squareup.okhttp.Call call = getDogmaDynamicItemsTypeIdItemIdValidateBeforeCall(itemId, typeId, datasource,
                ifNoneMatch, null, null);
        Type localVarReturnType = new TypeToken<DogmaDynamicItemsResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get dynamic item information (asynchronously) Returns info about a
     * dynamic item resulting from mutation with a mutaplasmid. --- This route
     * expires daily at 11:05
     * 
     * @param itemId
     *            item_id integer (required)
     * @param typeId
     *            type_id integer (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public com.squareup.okhttp.Call getDogmaDynamicItemsTypeIdItemIdAsync(Long itemId, Integer typeId,
            String datasource, String ifNoneMatch, final ApiCallback<DogmaDynamicItemsResponse> callback)
            throws ApiException {

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

        com.squareup.okhttp.Call call = getDogmaDynamicItemsTypeIdItemIdValidateBeforeCall(itemId, typeId, datasource,
                ifNoneMatch, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DogmaDynamicItemsResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /* Build call for getDogmaEffects */
    private com.squareup.okhttp.Call getDogmaEffectsCall(String datasource, String ifNoneMatch,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/dogma/effects/".replaceAll("\\{format\\}", "json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (datasource != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifNoneMatch != null)
            localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));

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

        String[] localVarAuthNames = new String[] {};
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams,
                localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDogmaEffectsValidateBeforeCall(String datasource, String ifNoneMatch,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        com.squareup.okhttp.Call call = getDogmaEffectsCall(datasource, ifNoneMatch, progressListener,
                progressRequestListener);
        return call;

    }

    /**
     * Get effects Get a list of dogma effect ids --- This route expires daily
     * at 11:05
     * 
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @return List&lt;Integer&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public List<Integer> getDogmaEffects(String datasource, String ifNoneMatch) throws ApiException {
        ApiResponse<List<Integer>> resp = getDogmaEffectsWithHttpInfo(datasource, ifNoneMatch);
        return resp.getData();
    }

    /**
     * Get effects Get a list of dogma effect ids --- This route expires daily
     * at 11:05
     * 
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @return ApiResponse&lt;List&lt;Integer&gt;&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<List<Integer>> getDogmaEffectsWithHttpInfo(String datasource, String ifNoneMatch)
            throws ApiException {
        com.squareup.okhttp.Call call = getDogmaEffectsValidateBeforeCall(datasource, ifNoneMatch, null, null);
        Type localVarReturnType = new TypeToken<List<Integer>>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get effects (asynchronously) Get a list of dogma effect ids --- This
     * route expires daily at 11:05
     * 
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public com.squareup.okhttp.Call getDogmaEffectsAsync(String datasource, String ifNoneMatch,
            final ApiCallback<List<Integer>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDogmaEffectsValidateBeforeCall(datasource, ifNoneMatch, progressListener,
                progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Integer>>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /* Build call for getDogmaEffectsEffectId */
    private com.squareup.okhttp.Call getDogmaEffectsEffectIdCall(Integer effectId, String datasource,
            String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/dogma/effects/{effect_id}/".replaceAll("\\{format\\}", "json").replaceAll(
                "\\{" + "effect_id" + "\\}", apiClient.escapeString(effectId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (datasource != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifNoneMatch != null)
            localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));

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

        String[] localVarAuthNames = new String[] {};
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams,
                localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDogmaEffectsEffectIdValidateBeforeCall(Integer effectId, String datasource,
            String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'effectId' is set
        if (effectId == null) {
            throw new ApiException(
                    "Missing the required parameter 'effectId' when calling getDogmaEffectsEffectId(Async)");
        }

        com.squareup.okhttp.Call call = getDogmaEffectsEffectIdCall(effectId, datasource, ifNoneMatch,
                progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get effect information Get information on a dogma effect --- This route
     * expires daily at 11:05
     * 
     * @param effectId
     *            A dogma effect ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @return DogmaEffectResponse
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public DogmaEffectResponse getDogmaEffectsEffectId(Integer effectId, String datasource, String ifNoneMatch)
            throws ApiException {
        ApiResponse<DogmaEffectResponse> resp = getDogmaEffectsEffectIdWithHttpInfo(effectId, datasource, ifNoneMatch);
        return resp.getData();
    }

    /**
     * Get effect information Get information on a dogma effect --- This route
     * expires daily at 11:05
     * 
     * @param effectId
     *            A dogma effect ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @return ApiResponse&lt;DogmaEffectResponse&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<DogmaEffectResponse> getDogmaEffectsEffectIdWithHttpInfo(Integer effectId, String datasource,
            String ifNoneMatch) throws ApiException {
        com.squareup.okhttp.Call call = getDogmaEffectsEffectIdValidateBeforeCall(effectId, datasource, ifNoneMatch,
                null, null);
        Type localVarReturnType = new TypeToken<DogmaEffectResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get effect information (asynchronously) Get information on a dogma effect
     * --- This route expires daily at 11:05
     * 
     * @param effectId
     *            A dogma effect ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public com.squareup.okhttp.Call getDogmaEffectsEffectIdAsync(Integer effectId, String datasource,
            String ifNoneMatch, final ApiCallback<DogmaEffectResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDogmaEffectsEffectIdValidateBeforeCall(effectId, datasource, ifNoneMatch,
                progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DogmaEffectResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
