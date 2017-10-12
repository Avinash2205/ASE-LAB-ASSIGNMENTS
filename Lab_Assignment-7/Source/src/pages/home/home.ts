import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import { Facebook } from '@ionic-native/facebook';
import firebase from 'firebase';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {

  constructor(public navCtrl: NavController,public facebook:Facebook) {


  }
fblogin(){
  this.facebook.login(['email']).then(res=>{
    const fc=firebase.auth.FacebookAuthProvider.credential(res.authResponse.accessToken)
    firebase.auth().signInWithCredential(fc).then(fs=>{
      alert("firebase sec")

    }).catch(ferr=>{
      alert("firebase errc")
    })

  }).catch(err=>{
    alert(JSON.stringify(err))
  })
}
}
