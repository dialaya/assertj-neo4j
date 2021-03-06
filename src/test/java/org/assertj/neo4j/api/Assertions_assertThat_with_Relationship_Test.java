/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2013-2019 the original author or authors.
 */
package org.assertj.neo4j.api;

import org.junit.Test;
import org.neo4j.graphdb.Relationship;

import static org.assertj.neo4j.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.mock;

/**
 * Tests for <code>{@link Assertions#assertThat(org.neo4j.graphdb.Relationship)}</code>
 * 
 * @author Florent Biville
 */
public class Assertions_assertThat_with_Relationship_Test {

  @Test
  public void should_create_Assert() {
    RelationshipAssert relationshipAssert = assertThat(mock(Relationship.class));
    assertNotNull(relationshipAssert);
  }

  @Test
  public void should_pass_actual() {
    Relationship relationship = mock(Relationship.class);
    RelationshipAssert relationshipAssert = assertThat(relationship);
    assertSame(relationship, relationshipAssert.getActual());
  }
}
