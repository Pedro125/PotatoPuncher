using UnityEngine;
using System.Collections;

public class SpudRotation: MonoBehaviour
{
    public int xRotationSpeed = 1;
    public int yRotationSpeed = 1;
    public int zRotationSpeed = 1;
    
    void Update()
    {
        Transform.Rotate(xRotationSpeed*Time.deltaTime,yRotationSpeed*Time.deltaTime,zRotationSpeed*Time.deltaTime);
    }
}
