package org.fuin.dsl.ddd.extensions;

import com.google.common.base.Objects;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AggregateId;

/**
 * Provides extension methods for Aggregate.
 */
@SuppressWarnings("all")
public class DddAggregateExtensions {
  /**
   * Returns the aggregate identifier type regardless if it's
   * defined inside the aggregate or somewhere outside.
   * 
   * @param aggregate Aggregate to return the identifier type for.
   * 
   * @return Aggregate identifier type.
   */
  public static AggregateId getIdTypeNullsafe(final Aggregate aggregate) {
    AggregateId _idType = aggregate.getIdType();
    boolean _equals = Objects.equal(_idType, null);
    if (_equals) {
      return aggregate.getAggregateId();
    }
    return aggregate.getIdType();
  }
}
