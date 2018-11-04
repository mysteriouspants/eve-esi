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
import java.util.ArrayList;
import java.util.List;
import net.troja.eve.esi.model.Position;
import net.troja.eve.esi.model.SystemPlanet;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class SystemResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("constellation_id")
    private Integer constellationId = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("planets")
    private List<SystemPlanet> planets = new ArrayList<SystemPlanet>();

    @SerializedName("position")
    private Position position = null;

    @SerializedName("security_class")
    private String securityClass = null;

    @SerializedName("security_status")
    private Float securityStatus = null;

    @SerializedName("star_id")
    private Integer starId = null;

    @SerializedName("stargates")
    private List<Integer> stargates = new ArrayList<Integer>();

    @SerializedName("stations")
    private List<Integer> stations = new ArrayList<Integer>();

    @SerializedName("system_id")
    private Integer systemId = null;

    public SystemResponse constellationId(Integer constellationId) {
        this.constellationId = constellationId;
        return this;
    }

    /**
     * The constellation this solar system is in
     * 
     * @return constellationId
     **/
    @ApiModelProperty(example = "null", required = true, value = "The constellation this solar system is in")
    public Integer getConstellationId() {
        return constellationId;
    }

    public void setConstellationId(Integer constellationId) {
        this.constellationId = constellationId;
    }

    public SystemResponse name(String name) {
        this.name = name;
        return this;
    }

    /**
     * name string
     * 
     * @return name
     **/
    @ApiModelProperty(example = "null", required = true, value = "name string")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SystemResponse planets(List<SystemPlanet> planets) {
        this.planets = planets;
        return this;
    }

    public SystemResponse addPlanetsItem(SystemPlanet planetsItem) {
        this.planets.add(planetsItem);
        return this;
    }

    /**
     * planets array
     * 
     * @return planets
     **/
    @ApiModelProperty(example = "null", value = "planets array")
    public List<SystemPlanet> getPlanets() {
        return planets;
    }

    public void setPlanets(List<SystemPlanet> planets) {
        this.planets = planets;
    }

    public SystemResponse position(Position position) {
        this.position = position;
        return this;
    }

    /**
     * Get position
     * 
     * @return position
     **/
    @ApiModelProperty(example = "null", required = true, value = "")
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public SystemResponse securityClass(String securityClass) {
        this.securityClass = securityClass;
        return this;
    }

    /**
     * security_class string
     * 
     * @return securityClass
     **/
    @ApiModelProperty(example = "null", value = "security_class string")
    public String getSecurityClass() {
        return securityClass;
    }

    public void setSecurityClass(String securityClass) {
        this.securityClass = securityClass;
    }

    public SystemResponse securityStatus(Float securityStatus) {
        this.securityStatus = securityStatus;
        return this;
    }

    /**
     * security_status number
     * 
     * @return securityStatus
     **/
    @ApiModelProperty(example = "null", required = true, value = "security_status number")
    public Float getSecurityStatus() {
        return securityStatus;
    }

    public void setSecurityStatus(Float securityStatus) {
        this.securityStatus = securityStatus;
    }

    public SystemResponse starId(Integer starId) {
        this.starId = starId;
        return this;
    }

    /**
     * star_id integer
     * 
     * @return starId
     **/
    @ApiModelProperty(example = "null", value = "star_id integer")
    public Integer getStarId() {
        return starId;
    }

    public void setStarId(Integer starId) {
        this.starId = starId;
    }

    public SystemResponse stargates(List<Integer> stargates) {
        this.stargates = stargates;
        return this;
    }

    public SystemResponse addStargatesItem(Integer stargatesItem) {
        this.stargates.add(stargatesItem);
        return this;
    }

    /**
     * stargates array
     * 
     * @return stargates
     **/
    @ApiModelProperty(example = "null", value = "stargates array")
    public List<Integer> getStargates() {
        return stargates;
    }

    public void setStargates(List<Integer> stargates) {
        this.stargates = stargates;
    }

    public SystemResponse stations(List<Integer> stations) {
        this.stations = stations;
        return this;
    }

    public SystemResponse addStationsItem(Integer stationsItem) {
        this.stations.add(stationsItem);
        return this;
    }

    /**
     * stations array
     * 
     * @return stations
     **/
    @ApiModelProperty(example = "null", value = "stations array")
    public List<Integer> getStations() {
        return stations;
    }

    public void setStations(List<Integer> stations) {
        this.stations = stations;
    }

    public SystemResponse systemId(Integer systemId) {
        this.systemId = systemId;
        return this;
    }

    /**
     * system_id integer
     * 
     * @return systemId
     **/
    @ApiModelProperty(example = "null", required = true, value = "system_id integer")
    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SystemResponse systemResponse = (SystemResponse) o;
        return Objects.equals(this.constellationId, systemResponse.constellationId)
                && Objects.equals(this.name, systemResponse.name)
                && Objects.equals(this.planets, systemResponse.planets)
                && Objects.equals(this.position, systemResponse.position)
                && Objects.equals(this.securityClass, systemResponse.securityClass)
                && Objects.equals(this.securityStatus, systemResponse.securityStatus)
                && Objects.equals(this.starId, systemResponse.starId)
                && Objects.equals(this.stargates, systemResponse.stargates)
                && Objects.equals(this.stations, systemResponse.stations)
                && Objects.equals(this.systemId, systemResponse.systemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(constellationId, name, planets, position, securityClass, securityStatus, starId, stargates,
                stations, systemId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SystemResponse {\n");

        sb.append("    constellationId: ").append(toIndentedString(constellationId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    planets: ").append(toIndentedString(planets)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    securityClass: ").append(toIndentedString(securityClass)).append("\n");
        sb.append("    securityStatus: ").append(toIndentedString(securityStatus)).append("\n");
        sb.append("    starId: ").append(toIndentedString(starId)).append("\n");
        sb.append("    stargates: ").append(toIndentedString(stargates)).append("\n");
        sb.append("    stations: ").append(toIndentedString(stations)).append("\n");
        sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
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
