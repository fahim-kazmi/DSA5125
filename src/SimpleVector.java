public class SimpleVector<T>
{
    private Object[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public SimpleVector()
    {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void add(T element)
    {
        ensureCapacity();
        elements[size++] = element;
    }

    public T get(int index)
    {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) elements[index];
    }

    public int size()
    {
        return size;
    }

    private void ensureCapacity()
    {
        if (size == elements.length)
        {
            int newCapacity = elements.length * 2;
            Object[] newArray = new Object[newCapacity];
            for (int i = 0; i < size; i++)
            {
                newArray[i] = elements[i];
            }
            elements = newArray;
        }
    }
}
