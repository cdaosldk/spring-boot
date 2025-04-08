/*
 * Copyright 2012-2025 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.autoconfigure.http.client.reactive;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import org.springframework.boot.autoconfigure.http.client.reactive.AbstractClientHttpConnectorProperties.Connector;
import org.springframework.boot.http.client.reactive.HttpComponentsClientHttpConnectorBuilder;
import org.springframework.boot.http.client.reactive.JdkClientHttpConnectorBuilder;
import org.springframework.boot.http.client.reactive.JettyClientHttpConnectorBuilder;
import org.springframework.boot.http.client.reactive.ReactorClientHttpConnectorBuilder;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link HttpReactiveClientSettingsProperties}.
 *
 * @author Phillip Webb
 */
class HttpReactiveClientSettingsPropertiesTests {

	@Nested
	class ConnectorTests {

		@Test
		void reactorBuilder() {
			assertThat(Connector.REACTOR.builder()).isInstanceOf(ReactorClientHttpConnectorBuilder.class);
		}

		@Test
		void jettyBuilder() {
			assertThat(Connector.JETTY.builder()).isInstanceOf(JettyClientHttpConnectorBuilder.class);
		}

		@Test
		void httpComponentsBuilder() {
			assertThat(Connector.HTTP_COMPONENTS.builder())
				.isInstanceOf(HttpComponentsClientHttpConnectorBuilder.class);
		}

		@Test
		void jdkBuilder() {
			assertThat(Connector.JDK.builder()).isInstanceOf(JdkClientHttpConnectorBuilder.class);
		}

	}

}
