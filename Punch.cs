using UnityEngine;
using System.Collections;

public class Punch : MonoBehaviour
{
  public int punchMult = 1;
  
  void Update()
  {
    if(checkPunch())
    {
      Counter counter = GetComponent<Counter>();
      //So we can reference Counter script and its vars/functions
      counter.add(punchMult);
      //calls add function from counter script
    }
  }
  
  void buyPunch()
  {
  //to be called by the Shopper/GUI script with purchased
    punchMult++;
  }
  
  bool checkPunch()
  {
    //Check if player has puncher potato
    return false;
  }
}
