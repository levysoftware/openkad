package il.technion.ewolf.kbr.openkad;

import il.technion.ewolf.kbr.Node;

import java.util.Collection;

/**
 * Represents A finate container for nodes
 * 
 * @author eyal.kibbar@gmail.com
 *
 */
interface Bucket {

	/**
	 * Adds a new node to the bucket
	 * @param n the new node
	 */
	public void insert(KadNode n);

	/**
	 * Adds all nodes in bucket to the given collection
	 * @param c the collection the nodes will be added to
	 */
	void addNodesTo(Collection<Node> c);
}
