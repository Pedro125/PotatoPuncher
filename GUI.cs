using UnityEngine;
using System.Collections;

public class GUI : MonoBehaviour
{
  //Variables
  
  public float top = (0.85)*Screen.height;
  public float height = Screen.height - top;
  
  public float width = Screen.width/3;
  //Screen.width
  
  void OnGui()
  {
    if (GUI.Box(new Rect(0,top,width,height),"Button One"))
    {
      
    }
  }
}
