/*
 * Copyright (c) 2018 ThanksMister LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.thanksmister.iot.wallpanellegacy.di;

import android.app.Service;

import com.thanksmister.iot.wallpanellegacy.network.WallPanelService;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.ServiceKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {
        ServiceSubcomponent.class
})
public abstract class ServicesModule {
    @Binds
    @IntoMap
    @ServiceKey(WallPanelService.class)
    abstract AndroidInjector.Factory<? extends Service> syncServiceInjectorFactory(ServiceSubcomponent.Builder builder);
}