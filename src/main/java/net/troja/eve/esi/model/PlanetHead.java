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

package net.troja.eve.esi.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * head object
 */
@ApiModel(description = "head object")
public class PlanetHead implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("head_id")
    private Integer headId = null;

    @SerializedName("latitude")
    private Float latitude = null;

    @SerializedName("longitude")
    private Float longitude = null;

    public PlanetHead headId(Integer headId) {
        this.headId = headId;
        return this;
    }

    /**
     * head_id integer minimum: 0 maximum: 9
     * 
     * @return headId
     **/
    @ApiModelProperty(example = "null", required = true, value = "head_id integer")
    public Integer getHeadId() {
        return headId;
    }

    public void setHeadId(Integer headId) {
        this.headId = headId;
    }

    public PlanetHead latitude(Float latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * latitude number
     * 
     * @return latitude
     **/
    @ApiModelProperty(example = "null", required = true, value = "latitude number")
    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public PlanetHead longitude(Float longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * longitude number
     * 
     * @return longitude
     **/
    @ApiModelProperty(example = "null", required = true, value = "longitude number")
    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlanetHead planetHead = (PlanetHead) o;
        return Objects.equals(this.headId, planetHead.headId) && Objects.equals(this.latitude, planetHead.latitude)
                && Objects.equals(this.longitude, planetHead.longitude);
    }

    @Override
    public int hashCode() {
        return Objects.hash(headId, latitude, longitude);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlanetHead {\n");

        sb.append("    headId: ").append(toIndentedString(headId)).append("\n");
        sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
        sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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
