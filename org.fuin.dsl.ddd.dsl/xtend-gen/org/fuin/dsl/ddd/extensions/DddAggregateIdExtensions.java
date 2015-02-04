package org.fuin.dsl.ddd.extensions;

import com.google.common.base.Objects;
import org.eclipse.emf.ecore.EObject;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AggregateId;

/**
 * Provides extension methods for AggregateId.
 */
@SuppressWarnings("all")
public class DddAggregateIdExtensions {
  /**
   * Returns the aggregate type regardless if it's defined as parent
   * of the aggregate identifier or somewhere else.
   * 
   * @param aggregateId Aggregate ID to return the aggregate type for.
   * 
   * @return Aggregate type.
   */
  public static Aggregate getAggregateNullsafe(final AggregateId aggregateId) {
    Aggregate _aggregate = aggregateId.getAggregate();
    boolean _equals = Objects.equal(_aggregate, null);
    if (_equals) {
      EObject _eContainer = aggregateId.eContainer();
      return ((Aggregate) _eContainer);
    }
    return aggregateId.getAggregate();
  }
}
