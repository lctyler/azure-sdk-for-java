/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.common.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for AzureRegion.
 */
public final class AzureRegion extends ExpandableStringEnum<AzureRegion> {
    /** Static value eastus for AzureRegion. */
    public static final AzureRegion EAST_US = fromString("eastus");

    /** Static value eastus2 for AzureRegion. */
    public static final AzureRegion EAST_US_2 = fromString("eastus2");

    /** Static value centralus for AzureRegion. */
    public static final AzureRegion CENTRAL_US = fromString("centralus");

    /** Static value northcentralus for AzureRegion. */
    public static final AzureRegion NORTH_CENTRAL_US = fromString("northcentralus");

    /** Static value southcentralus for AzureRegion. */
    public static final AzureRegion SOUTH_CENTRAL_US = fromString("southcentralus");

    /** Static value westcentralus for AzureRegion. */
    public static final AzureRegion WEST_CENTRAL_US = fromString("westcentralus");

    /** Static value westus for AzureRegion. */
    public static final AzureRegion WEST_US = fromString("westus");

    /** Static value westus2 for AzureRegion. */
    public static final AzureRegion WEST_US_2 = fromString("westus2");

    /** Static value canadaeast for AzureRegion. */
    public static final AzureRegion CANADA_EAST = fromString("canadaeast");

    /** Static value canadacentral for AzureRegion. */
    public static final AzureRegion CANADA_CENTRAL = fromString("canadacentral");

    /** Static value brazilsouth for AzureRegion. */
    public static final AzureRegion BRAZIL_SOUTH = fromString("brazilsouth");

    /** Static value northeurope for AzureRegion. */
    public static final AzureRegion NORTH_EUROPE = fromString("northeurope");

    /** Static value westeurope for AzureRegion. */
    public static final AzureRegion WEST_EUROPE = fromString("westeurope");

    /** Static value francecentral for AzureRegion. */
    public static final AzureRegion FRANCE_CENTRAL = fromString("francecentral");

    /** Static value francesouth for AzureRegion. */
    public static final AzureRegion FRANCE_SOUTH = fromString("francesouth");

    /** Static value germanycentral for AzureRegion. */
    public static final AzureRegion GERMANY_CENTRAL = fromString("germanycentral");

    /** Static value germanynortheast for AzureRegion. */
    public static final AzureRegion GERMANY_NORTHEAST = fromString("germanynortheast");

    /** Static value ukwest for AzureRegion. */
    public static final AzureRegion UK_WEST = fromString("ukwest");

    /** Static value uksouth for AzureRegion. */
    public static final AzureRegion UK_SOUTH = fromString("uksouth");

    /** Static value southeastasia for AzureRegion. */
    public static final AzureRegion SOUTHEAST_ASIA = fromString("southeastasia");

    /** Static value eastasia for AzureRegion. */
    public static final AzureRegion EAST_ASIA = fromString("eastasia");

    /** Static value australiacentral for AzureRegion. */
    public static final AzureRegion AUSTRALIA_CENTRAL = fromString("australiacentral");

    /** Static value australiacentral2 for AzureRegion. */
    public static final AzureRegion AUSTRALIA_CENTRAL_2 = fromString("australiacentral2");

    /** Static value australiaeast for AzureRegion. */
    public static final AzureRegion AUSTRALIA_EAST = fromString("australiaeast");

    /** Static value australiasoutheast for AzureRegion. */
    public static final AzureRegion AUSTRALIA_SOUTHEAST = fromString("australiasoutheast");

    /** Static value centralindia for AzureRegion. */
    public static final AzureRegion CENTRAL_INDIA = fromString("centralindia");

    /** Static value westindia for AzureRegion. */
    public static final AzureRegion WEST_INDIA = fromString("westindia");

    /** Static value southindia for AzureRegion. */
    public static final AzureRegion SOUTH_INDIA = fromString("southindia");

    /** Static value japaneast for AzureRegion. */
    public static final AzureRegion JAPAN_EAST = fromString("japaneast");

    /** Static value japanwest for AzureRegion. */
    public static final AzureRegion JAPAN_WEST = fromString("japanwest");

    /** Static value koreacentral for AzureRegion. */
    public static final AzureRegion KOREA_CENTRAL = fromString("koreacentral");

    /** Static value koreasouth for AzureRegion. */
    public static final AzureRegion KOREA_SOUTH = fromString("koreasouth");

    /** Static value usgovvirginia for AzureRegion. */
    public static final AzureRegion US_GOV_VIRGINIA = fromString("usgovvirginia");

    /** Static value usgoviowa for AzureRegion. */
    public static final AzureRegion US_GOV_IOWA = fromString("usgoviowa");

    /** Static value usgovarizona for AzureRegion. */
    public static final AzureRegion US_GOV_ARIZONA = fromString("usgovarizona");

    /** Static value usgovtexas for AzureRegion. */
    public static final AzureRegion US_GOV_TEXAS = fromString("usgovtexas");

    /** Static value usdodeast for AzureRegion. */
    public static final AzureRegion US_DO_D_EAST = fromString("usdodeast");

    /** Static value usdodcentral for AzureRegion. */
    public static final AzureRegion US_DO_D_CENTRAL = fromString("usdodcentral");

    /**
     * Creates or finds a AzureRegion from its string representation.
     * @param name a name to look for
     * @return the corresponding AzureRegion
     */
    @JsonCreator
    public static AzureRegion fromString(String name) {
        return fromString(name, AzureRegion.class);
    }

    /**
     * @return known AzureRegion values
     */
    public static Collection<AzureRegion> values() {
        return values(AzureRegion.class);
    }
}
