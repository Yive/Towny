package com.palmergames.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;

import com.palmergames.util.KeyValue;
import com.palmergames.util.Sorting;

public class KeyValueTable<K, V> {

	private List<KeyValue<K, V>> keyValues = new ArrayList<>();

	public List<KeyValue<K, V>> getKeyValues() {

		return keyValues;
	}

	public void setKeyValues(List<KeyValue<K, V>> keyValues) {

		this.keyValues = keyValues;
	}

	public KeyValueTable() {

	}

	public KeyValueTable(Hashtable<K, V> table) {

		this(new ArrayList<>(table.keySet()), new ArrayList<>(table.values()));
	}

	public KeyValueTable(List<K> keys, List<V> values) {

		//if (keys.size() != values.size())
		//	throw new Exception();

		for (int i = 0; i < keys.size(); i++)
			keyValues.add(new KeyValue<>(keys.get(i), values.get(i)));
	}

	public void put(K key, V value) {

		keyValues.add(new KeyValue<>(key, value));
	}

	public void add(KeyValue<K, V> keyValue) {

		keyValues.add(keyValue);
	}

	public void sortByKey() {

		Collections.sort(keyValues, new Sorting.KeySort());
	}

	public void sortByValue() {

		Collections.sort(keyValues, new Sorting.ValueSort());
	}

	public void reverse() {

		Collections.reverse(keyValues);
	}
}