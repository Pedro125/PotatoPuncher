using UnityEngine;
using System.Collections;

public class Counter : MonoBehaviour
{
  //Variables
  public int numPotatoes = 0;
  //Update is called once per frame
  void Update()
  {
    
  }
  
  void add(int num)
  {
    numPotatoes+=num;
  }
}
