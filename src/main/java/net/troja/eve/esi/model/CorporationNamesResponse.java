/**
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.2.7.dev1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.troja.eve.esi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CorporationNamesResponse implements Serializable {
    @JsonProperty("corporation_id")
    private Integer corporationId = null;

    @JsonProperty("corporation_name")
    private String corporationName = null;

    public CorporationNamesResponse corporationId(Integer corporationId) {
        this.corporationId = corporationId;
        return this;
    }

    /**
     * corporation_id integer
     * 
     * @return corporationId
     **/
    @ApiModelProperty(example = "null", required = true, value = "corporation_id integer")
    public Integer getCorporationId() {
        return corporationId;
    }

    public void setCorporationId(Integer corporationId) {
        this.corporationId = corporationId;
    }

    public CorporationNamesResponse corporationName(String corporationName) {
        this.corporationName = corporationName;
        return this;
    }

    /**
     * corporation_name string
     * 
     * @return corporationName
     **/
    @ApiModelProperty(example = "null", required = true, value = "corporation_name string")
    public String getCorporationName() {
        return corporationName;
    }

    public void setCorporationName(String corporationName) {
        this.corporationName = corporationName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationNamesResponse corporationNamesResponse = (CorporationNamesResponse) o;
        return Objects.equals(this.corporationId, corporationNamesResponse.corporationId)
                && Objects.equals(this.corporationName, corporationNamesResponse.corporationName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(corporationId, corporationName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationNamesResponse {\n");

        sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
        sb.append("    corporationName: ").append(toIndentedString(corporationName)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}