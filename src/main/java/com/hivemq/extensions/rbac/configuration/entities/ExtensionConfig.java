/*
 * Copyright 2018 dc-square GmbH
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
 *
 */

package com.hivemq.extensions.rbac.configuration.entities;

import com.hivemq.extension.sdk.api.annotations.NotNull;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "extension-configuration")
@XmlType(propOrder = {})
@XmlAccessorType(XmlAccessType.NONE)
public class ExtensionConfig {

    @XmlElement(name = "credentials-reload-interval", defaultValue = "60")
    private int reloadInterval = 60;

    @XmlElement(name = "password-type", defaultValue = "HASHED")
    private @NotNull PasswordType passwordType = PasswordType.HASHED;

    public ExtensionConfig() {
    }

    public ExtensionConfig(final int reloadInterval, final @NotNull PasswordType passwordType) {
        this.reloadInterval = reloadInterval;
        this.passwordType = passwordType;
    }

    public int getReloadInterval() {
        return reloadInterval;
    }

    public void setReloadInterval(final int reloadInterval) {
        this.reloadInterval = reloadInterval;
    }

    public @NotNull PasswordType getPasswordType() {
        return passwordType;
    }

    public void setPasswordType(final @NotNull PasswordType passwordType) {
        this.passwordType = passwordType;
    }

    @Override
    public @NotNull String toString() {
        return "ExtensionConfiguration{" +
                "reloadInterval=" + reloadInterval +
                ", passwordType=" + passwordType +
                '}';
    }
}
