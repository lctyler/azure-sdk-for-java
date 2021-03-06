/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_02_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.implementation.BuildTaskInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.implementation.ContainerRegistryManager;
import java.util.Map;
import org.joda.time.DateTime;
import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.implementation.SourceRepositoryPropertiesInner;

/**
 * Type representing BuildTask.
 */
public interface BuildTask extends HasInner<BuildTaskInner>, Indexable, Refreshable<BuildTask>, Updatable<BuildTask.Update>, HasManager<ContainerRegistryManager> {
    /**
     * @return the alias value.
     */
    String alias();

    /**
     * @return the creationDate value.
     */
    DateTime creationDate();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the platform value.
     */
    PlatformProperties platform();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the sourceRepository value.
     */
    SourceRepositoryProperties sourceRepository();

    /**
     * @return the status value.
     */
    BuildTaskStatus status();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the timeout value.
     */
    Integer timeout();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the BuildTask definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithRegistry, DefinitionStages.WithAlias, DefinitionStages.WithLocation, DefinitionStages.WithPlatform, DefinitionStages.WithSourceRepository, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of BuildTask definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a BuildTask definition.
         */
        interface Blank extends WithRegistry {
        }

        /**
         * The stage of the buildtask definition allowing to specify Registry.
         */
        interface WithRegistry {
           /**
            * Specifies resourceGroupName, registryName.
            */
            WithAlias withExistingRegistry(String resourceGroupName, String registryName);
        }

        /**
         * The stage of the buildtask definition allowing to specify Alias.
         */
        interface WithAlias {
           /**
            * Specifies alias.
            */
            WithLocation withAlias(String alias);
        }

        /**
         * The stage of the buildtask definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            */
            WithPlatform withLocation(String location);
        }

        /**
         * The stage of the buildtask definition allowing to specify Platform.
         */
        interface WithPlatform {
           /**
            * Specifies platform.
            */
            WithSourceRepository withPlatform(PlatformProperties platform);
        }

        /**
         * The stage of the buildtask definition allowing to specify SourceRepository.
         */
        interface WithSourceRepository {
           /**
            * Specifies sourceRepository.
            */
            WithCreate withSourceRepository(SourceRepositoryPropertiesInner sourceRepository);
        }

        /**
         * The stage of the buildtask definition allowing to specify Status.
         */
        interface WithStatus {
            /**
             * Specifies status.
             */
            WithCreate withStatus(BuildTaskStatus status);
        }

        /**
         * The stage of the buildtask definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the buildtask definition allowing to specify Timeout.
         */
        interface WithTimeout {
            /**
             * Specifies timeout.
             */
            WithCreate withTimeout(Integer timeout);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<BuildTask>, DefinitionStages.WithStatus, DefinitionStages.WithTags, DefinitionStages.WithTimeout {
        }
    }
    /**
     * The template for a BuildTask update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<BuildTask>, UpdateStages.WithAlias, UpdateStages.WithPlatform, UpdateStages.WithSourceRepository, UpdateStages.WithStatus, UpdateStages.WithTags, UpdateStages.WithTimeout {
    }

    /**
     * Grouping of BuildTask update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the buildtask update allowing to specify Alias.
         */
        interface WithAlias {
            /**
             * Specifies alias.
             */
            Update withAlias(String alias);
        }

        /**
         * The stage of the buildtask update allowing to specify Platform.
         */
        interface WithPlatform {
            /**
             * Specifies platform.
             */
            Update withPlatform(PlatformProperties platform);
        }

        /**
         * The stage of the buildtask update allowing to specify SourceRepository.
         */
        interface WithSourceRepository {
            /**
             * Specifies sourceRepository.
             */
            Update withSourceRepository(SourceRepositoryUpdateParameters sourceRepository);
        }

        /**
         * The stage of the buildtask update allowing to specify Status.
         */
        interface WithStatus {
            /**
             * Specifies status.
             */
            Update withStatus(BuildTaskStatus status);
        }

        /**
         * The stage of the buildtask update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the buildtask update allowing to specify Timeout.
         */
        interface WithTimeout {
            /**
             * Specifies timeout.
             */
            Update withTimeout(Integer timeout);
        }

    }
}
