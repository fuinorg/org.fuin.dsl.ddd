package org.fuin.dsl.ddd.extensions;

import java.lang.reflect.InvocationTargetException
import java.lang.reflect.Method
import org.eclipse.emf.ecore.EObject
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainModel

class DddDomainModelExtensions {

	/**
     * Returns an abstract element of a given type by it's name. The object 
     * must have a public instance method <code>String getName()</code>.
     *  
     * Throws an exception if the element is not found.
     * 
     * @param model Domain model.
     * @param type Type to find.
     * @param name Name that is unique within the type.
     * 
     * @return Element.
     */
	def static <T extends EObject> T find(DomainModel model, Class<T> type, String name) {
		val iter = model.eAllContents.filter(type)
		while (iter.hasNext) {
			val T el = iter.next
			if (name.equals(el.name)) {
				return el
			}
		}
		throw new IllegalArgumentException("No element of type '" + type.simpleName + "' found with name '" + name + "'")
	}

	private def static String getName(Object obj) {
		if (obj === null) {
			return null
		}
        try {
            val Method method = obj.getClass().getMethod("getName", null);
            val Object result = method.invoke(obj, null);
			if (result instanceof String) {
				return result
			}
			// Returned other type than String
			return null
        } catch (SecurityException ex) {
            throw new RuntimeException(ex);
        } catch (NoSuchMethodException ex) {
        	// A "getName()" method does not exist
            return null;
        } catch (IllegalArgumentException ex) {
            throw new RuntimeException(ex);
        } catch (IllegalAccessException ex) {
            throw new RuntimeException(ex);
        } catch (InvocationTargetException ex) {
            throw new RuntimeException(ex);
        }

    }

}
