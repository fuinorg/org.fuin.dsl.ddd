package org.fuin.dsl.ddd.extensions;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractElement;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.AggregateId;
import org.fuin.dsl.ddd.extensions.DddCollectionExtensions;

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
      return DddAggregateExtensions.getAggregateId(aggregate);
    }
    return aggregate.getIdType();
  }
  
  /**
   * Returns the aggregate identifier that may be defined inside the aggregate.
   * 
   * @param aggregate Aggregate to return the identifier for.
   * 
   * @return Identifier or NULL if no such type is defined inside the aggregate.
   */
  public static AggregateId getAggregateId(final Aggregate aggregate) {
    EList<AbstractElement> _elements = aggregate.getElements();
    List<AbstractElement> _nullSafe = DddCollectionExtensions.<AbstractElement>nullSafe(_elements);
    final Iterable<AggregateId> types = Iterables.<AggregateId>filter(_nullSafe, AggregateId.class);
    int _length = ((Object[])Conversions.unwrapArray(types, Object.class)).length;
    boolean _equals = (_length == 0);
    if (_equals) {
      return null;
    }
    return ((AggregateId[])Conversions.unwrapArray(types, AggregateId.class))[0];
  }
}
