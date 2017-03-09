package groupproject;

//Java implementation of Counting Sort
class CountingSort
{
	void sort(char array[])
	{
		int n = array.length;

		// The output character array that will have sorted arr
		char sortedarray[] = new char[n];

		// Create a count array to store count of inidividul
		// characters and initialize count array as 0
		int count[] = new int[256];
		for (int i=0; i<256; ++i)
			count[i] = 0;

		// store count of each character
		for (int i=0; i<n; ++i)
			++count[array[i]];

		// Change count[i] so that count[i] now contains actual
		// position of this character in output array
		for (int i=1; i<=255; ++i)
			count[i] += count[i-1];

		// Build the output character array
		for (int i = 0; i<n; ++i)
		{
			sorted[count[array[i]]-1] = array[i];
			--count[array[i]];
		}

		// Copy the output array to arr, so that arr now
		// contains sorted characters
		for (int i = 0; i<n; ++i)
			array[i] = sortedarray[i];
	}

	// Driver method
	public static void main(String args[])
	{
		CountingSort ob = new CountingSort();
		char arr[] = {'1', '4', '1', '2', '7', '5', '2'};

		ob.sort(arr);

		System.out.print("Sorted character array is ");
		for (int i=0; i<arr.length; ++i)
			System.out.print(arr[i]);
	}
}
