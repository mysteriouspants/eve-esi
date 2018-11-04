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
 * Optional object that is returned if a bookmark was made on a planet or a
 * random location in space.
 */
@ApiModel(description = "Optional object that is returned if a bookmark was made on a planet or a random location in space.")
public class CharacterBookmarksCoordinates implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("x")
    private Double x = null;

    @SerializedName("y")
    private Double y = null;

    @SerializedName("z")
    private Double z = null;

    public CharacterBookmarksCoordinates x(Double x) {
        this.x = x;
        return this;
    }

    /**
     * x number
     * 
     * @return x
     **/
    @ApiModelProperty(example = "null", required = true, value = "x number")
    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public CharacterBookmarksCoordinates y(Double y) {
        this.y = y;
        return this;
    }

    /**
     * y number
     * 
     * @return y
     **/
    @ApiModelProperty(example = "null", required = true, value = "y number")
    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public CharacterBookmarksCoordinates z(Double z) {
        this.z = z;
        return this;
    }

    /**
     * z number
     * 
     * @return z
     **/
    @ApiModelProperty(example = "null", required = true, value = "z number")
    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterBookmarksCoordinates characterBookmarksCoordinates = (CharacterBookmarksCoordinates) o;
        return Objects.equals(this.x, characterBookmarksCoordinates.x)
                && Objects.equals(this.y, characterBookmarksCoordinates.y)
                && Objects.equals(this.z, characterBookmarksCoordinates.z);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterBookmarksCoordinates {\n");

        sb.append("    x: ").append(toIndentedString(x)).append("\n");
        sb.append("    y: ").append(toIndentedString(y)).append("\n");
        sb.append("    z: ").append(toIndentedString(z)).append("\n");
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
