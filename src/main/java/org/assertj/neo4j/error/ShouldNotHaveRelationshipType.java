/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2013-2014 the original author or authors.
 */
package org.assertj.neo4j.error;

import org.assertj.core.error.BasicErrorMessageFactory;
import org.assertj.core.error.ErrorMessageFactory;
import org.assertj.core.internal.StandardComparisonStrategy;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.RelationshipType;

public class ShouldNotHaveRelationshipType extends BasicErrorMessageFactory {

  /**
   * Creates a new </code>{@link org.assertj.neo4j.error.ShouldNotHaveRelationshipType}</code>.
   * 
   * @param actual the actual value in the failed assertion.
   * @param relationshipType the relationship type used in the failed assertion to compare the actual relationship type to.
   * @return the created {@code ErrorMessageFactory}.
   */
  public static ErrorMessageFactory shouldNotHaveRelationshipType(Relationship actual, RelationshipType relationshipType) {
    return new ShouldNotHaveRelationshipType(actual, relationshipType);
  }

  /**
   * Creates a new </code>{@link org.assertj.neo4j.error.ShouldNotHaveRelationshipType}</code>.
   *
   * @param actual the actual value in the failed assertion.
   * @param relationshipType the relationship type name used in the failed assertion to compare the actual relationship type name to.
   * @return the created {@code ErrorMessageFactory}.
   */
  public static ErrorMessageFactory shouldNotHaveRelationshipType(Relationship actual, String relationshipType) {
    return new ShouldNotHaveRelationshipType(actual, relationshipType);
  }

  private ShouldNotHaveRelationshipType(Relationship actual, RelationshipType other) {
    this(actual, other.name());
  }

  private ShouldNotHaveRelationshipType(Relationship actual, String other) {
    super("\nExpecting:\n  <%s>\nnot to have type:\n  <%s>\n%s", actual, other, StandardComparisonStrategy.instance());
  }
}
