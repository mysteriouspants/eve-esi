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
 * label object
 */
@ApiModel(description = "label object")
public class MailLabelSimple implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * Hexadecimal string representing label color, in RGB format
     */
    public enum ColorEnum {
        @SerializedName("#0000fe")
        _0000FE("#0000fe"),

        @SerializedName("#006634")
        _006634("#006634"),

        @SerializedName("#0099ff")
        _0099FF("#0099ff"),

        @SerializedName("#00ff33")
        _00FF33("#00ff33"),

        @SerializedName("#01ffff")
        _01FFFF("#01ffff"),

        @SerializedName("#349800")
        _349800("#349800"),

        @SerializedName("#660066")
        _660066("#660066"),

        @SerializedName("#666666")
        _666666("#666666"),

        @SerializedName("#999999")
        _999999("#999999"),

        @SerializedName("#99ffff")
        _99FFFF("#99ffff"),

        @SerializedName("#9a0000")
        _9A0000("#9a0000"),

        @SerializedName("#ccff9a")
        CCFF9A("#ccff9a"),

        @SerializedName("#e6e6e6")
        E6E6E6("#e6e6e6"),

        @SerializedName("#fe0000")
        FE0000("#fe0000"),

        @SerializedName("#ff6600")
        FF6600("#ff6600"),

        @SerializedName("#ffff01")
        FFFF01("#ffff01"),

        @SerializedName("#ffffcd")
        FFFFCD("#ffffcd"),

        @SerializedName("#ffffff")
        FFFFFF("#ffffff");

        private String value;

        ColorEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    @SerializedName("color")
    private ColorEnum color = ColorEnum.FFFFFF;

    @SerializedName("name")
    private String name = null;

    public MailLabelSimple color(ColorEnum color) {
        this.color = color;
        return this;
    }

    /**
     * Hexadecimal string representing label color, in RGB format
     * 
     * @return color
     **/
    @ApiModelProperty(example = "null", value = "Hexadecimal string representing label color, in RGB format")
    public ColorEnum getColor() {
        return color;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public MailLabelSimple name(String name) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MailLabelSimple mailLabelSimple = (MailLabelSimple) o;
        return Objects.equals(this.color, mailLabelSimple.color) && Objects.equals(this.name, mailLabelSimple.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MailLabelSimple {\n");

        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
